package com.luckydb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.luckydb.dao.UserDao;
import com.luckydb.model.User;
import com.luckydb.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	UserDao userDao;

	@Override
	public List<User> readAllUser() {
		return userDao.readAllUser();
	}

}
