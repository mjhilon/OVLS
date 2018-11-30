package cn.xdl.ovls.user.service;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleSizeExpr.Unit;

import cn.xdl.ovls.common.util.Md5Utils;
import cn.xdl.ovls.user.dao.UserMapper;
import cn.xdl.ovls.user.entity.User;
import cn.xdl.ovls.user.util.TokenManager;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userDao;
	
	@Autowired
	private TokenManager tm;
	
	@Autowired
	private StringRedisTemplate redis;
	
	public int addUser(String name, String password) {
		//����˺��Ƿ����,���ڷ���2
		User user = userDao.selectByName(name);
		if(user!=null){
			return 2;
		}
		//�������ٽ��в���,����1
		user = new User();
		user.setName(name);
		//TODO ������ܴ���
		//��ȡ��ֵ
		String salt = Md5Utils.randomSalt();
		//md5(����+salt)
		String md5Password = Md5Utils.md5(password+salt);
		user.setPassword(md5Password);
		user.setSalt(salt);
		user.setRegtime(new Date());
		userDao.insertSelective(user);
		return 1;
	}

	public Map<String, Object> checkUser(String name, String password) {
		Map<String,Object> map = new HashMap<String, Object>();
		//����˺��Ƿ���ȷ
		User user = userDao.selectByName(name);
		if(user != null){
			//��������Ƿ���ȷ
			String md5Password = Md5Utils.md5(password+user.getSalt());
			if(md5Password.equals(user.getPassword())){
				//����һ����½����,���û�����
				String token = tm.createToken(user.getId());
				//�������ڷ������˴洢��redis��,24Сʱ����Ч
				redis.opsForValue().set(user.getId().toString(), token);
				redis.expire(user.getId().toString(), 24, TimeUnit.HOURS);//expire key n
				map.put("status", 1);
				map.put("token", token);//��¼�ɹ�
				map.put("userId", user.getId());
				return map;
			}else {
				map.put("status", 3);//�������
				return map;
			}
		}
		map.put("status", 2);
		return map;//�˺Ų�����
	}

	public boolean checkToken(String token, String userId) {
		if(token!=null&&!"".equals(token)
			&&userId!=null&&!"".equals(userId)){
			//�����ȷ��
			String redisToken = redis.opsForValue().get(userId);//��redis��ȡ����
			if(redisToken != null && redisToken.equals(token)){//δ���ڣ�ȡ��token���ȶ�һ����
				return true;
			}
		}
		return false;
	}

}
