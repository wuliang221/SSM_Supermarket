package com.Service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Service.UserService;
import com.dao.UserMapper;
import com.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User user(String UserName) {
		return userMapper.user(UserName);
	}

	@Override
	public boolean findUser(String UserName, String UserPW) {
		return userMapper.getUser(UserName, UserPW);
	}

}
