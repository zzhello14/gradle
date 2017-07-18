package com.zzdr.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zzdr.springboot.bean.User;
import com.zzdr.springboot.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
	@Autowired
	IUserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetUserByid() throws Exception {
		//for (int i = 0; i < 20; i++) {
		int userId = 1;
		User user = userService.getUserById(userId);
		System.out.println(user.getId() + ":" + user.getUsername());
		Thread.sleep(1000);
		//}
	}
}
