package cn.xdl.ovls.user.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xdl.ovls.common.entity.OvlsResult;
import cn.xdl.ovls.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	public OvlsResult login(String name,String password){
		OvlsResult result = new OvlsResult();
		try{
			Map<String, Object> data = userService.checkUser(name, password);
			int ret = (Integer)data.get("status");
			if(ret==1){
				result.setStatus(1);
				result.setMsg("��¼�ɹ�");
				result.setData(data);
			}else if(ret==2){
				result.setStatus(2);
				result.setMsg("�˺Ų�����");
			}else if(ret==3){
				result.setStatus(3);
				result.setMsg("�������");
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result.setStatus(0);
			result.setMsg("��¼�쳣");
		}
		return result;
	}
	
	
	@RequestMapping(value="/user/regist",method=RequestMethod.POST)
	public OvlsResult regist(String name,String password){
		OvlsResult result = new OvlsResult();
		try{
			int ret = userService.addUser(name, password);
			if(ret==1){
				result.setStatus(1);
				result.setMsg("ע��ɹ�");
			}else if(ret==2){
				result.setStatus(2);
				result.setMsg("�˺��Ѵ���");
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result.setStatus(0);
			result.setMsg("ע���쳣");
		}
		return result;
	}
	
	@RequestMapping(value="/user/token",method=RequestMethod.POST)
	public OvlsResult checkToken(String userId,String token){
		OvlsResult result = new OvlsResult();
		try{
			boolean ok = userService.checkToken(token, userId);
			if(ok){
				result.setStatus(1);
				result.setMsg("�Ϸ��û�");
			}else{
				result.setStatus(2);
				result.setMsg("δ��Ȩ�û�");
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result.setStatus(0);
			result.setMsg("ע���쳣");
		}
		return result;
	}
	
}
