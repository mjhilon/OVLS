package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.xdl.ovls.UserBootApplication;
import cn.xdl.ovls.user.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={UserBootApplication.class})
public class TestUserController {

	@Autowired
	private UserController userController;
	
	@Test
	public void test1() throws Exception{
		MockMvc mock = 
			MockMvcBuilders.standaloneSetup(userController).build();
		RequestBuilder request = MockMvcRequestBuilders.post("/user/regist")
			.param("name", "java16")
			.param("password", "123456");
		MvcResult result = mock.perform(request).andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println(content);
	}
	
	@Test
	public void test2() throws Exception{
		MockMvc mock = 
			MockMvcBuilders.standaloneSetup(userController).build();
		RequestBuilder request = MockMvcRequestBuilders.post("/user/login")
			.param("name", "java16")
			.param("password", "123456");
		MvcResult result = mock.perform(request).andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println(content);
	}
	
	@Test
	public void test3() throws Exception{
		MockMvc mock = 
			MockMvcBuilders.standaloneSetup(userController).build();
		RequestBuilder request = MockMvcRequestBuilders.post("/user/token")
			.param("userId", "2")
			.param("token", "00aaecea-2bb5-4a7d-a931-61ff0696c097-1522805464131-28");
		MvcResult result = mock.perform(request).andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println(content);
	}
	
}
