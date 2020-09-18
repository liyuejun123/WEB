package com.study.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.pojo.User;
import com.study.service.IUserService;

public class SpringJedisTest {
	
	@Test
	public void testRedis() throws Exception{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		IUserService userService=(IUserService)context.getBean("userService");
		System.out.println(userService.queryUser(123));//DEF:123
		System.out.println(userService.queryUser(123));
		//userService.updateUser(new User("123","tom"));//DEF:123
		//System.out.println(userService.queryUser("123"));
		//System.out.println(userService.queryUser("456"));
		//System.out.println(userService.queryUser("456"));
		//userService.deleteUser("123");
		//System.out.println(userService.queryUser("123"));
		//System.out.println(userService.queryUser("123"));
		
	}
}
