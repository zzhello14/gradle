package com.zzdr.springboot.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzdr.springboot.bean.User;
import com.zzdr.springboot.service.IUserService;

@RestController
public class Sample {
	@Autowired
	IUserService userService;

	@RequestMapping("/sayHello")
	public String sayHello() {
		return "hello world!";
	}

	@RequestMapping("/getList")
	public List<User> getList() {
		return userService.getUserList();
	}

	@RequestMapping("getUser")
	public User getUserById() {
		int userId = 1;
		return userService.getUserById(userId);
	}
}
