package com.zzdr.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.zzdr.springboot.bean.User;
import com.zzdr.springboot.service.IUserService;

@Service
public class UserService implements IUserService {

	@Cacheable(value = "getUserList")
	public List<User> getUserList() {
		System.out.println("从db中取");
		List<User> list = new ArrayList<User>();
		User u1 = new User();
		u1.setId(1);
		u1.setUsername("莫西风");

		User u2 = new User();
		u2.setId(2);
		u2.setUsername("张三丰");

		list.add(u1);
		list.add(u2);
		return list;
	}

	@Cacheable(value = "getUser")
	public User getUserById(int userId) {
		System.out.println("从db中取");
		User user = new User();
		user.setId(userId);
		user.setUsername("用户" + String.valueOf(userId));
		return user;
	}
}
