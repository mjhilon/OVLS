package cn.xdl.ovls.video.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.xdl.ovls.common.entity.OvlsResult;

@FeignClient(name="USER-SERVICE")//ָ��ע�������
public interface UserServiceRemote {
	//�����������ʾ����@RequestParam���
	@RequestMapping(value="/user/token",method=RequestMethod.POST)
	public OvlsResult checkToken(@RequestParam("userId")String userId,@RequestParam("token")String token);
	
}
