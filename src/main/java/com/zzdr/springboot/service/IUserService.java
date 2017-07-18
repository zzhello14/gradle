package com.zzdr.springboot.service;

import java.util.List;

import com.zzdr.springboot.bean.User;

public interface IUserService {
	public List<User> getUserList();

	public User getUserById(int userId);
}
