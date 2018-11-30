package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import cn.xdl.ovls.UserBootApplication;
import cn.xdl.ovls.user.dao.UserMapper;
import cn.xdl.ovls.user.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={UserBootApplication.class})
public class TestUserDao {

	@Autowired
	private UserMapper userDao;
	
	@Test
	public void test1(){
		User user = userDao.selectByPrimaryKey(1);
		System.out.println(user.getName());
		System.out.println(user.getPassword());
	}
	
	@Test
	public void test2(){
		User user = userDao.selectByPrimaryKey(10);
		if(user==null){
			System.out.println("δ�ҵ���¼");
		}
	}
	
	@Test
	@Transactional
	public void test3(){
		User user1 = new User();
		user1.setName("xdl1");
		user1.setPassword("123");
		userDao.insertSelective(user1);
		
		
		User user2 = new User();
		user2.setName("xdl1111111111111111111111111111111111111111111111111111111111111111");
		user2.setPassword("123");
		userDao.insertSelective(user2);
	}
	
}
