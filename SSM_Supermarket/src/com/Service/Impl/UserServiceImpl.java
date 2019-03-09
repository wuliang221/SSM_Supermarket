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
	
	//查询用户名放入session
	@Override
	public User user(String UserName) {
		return userMapper.user(UserName);
	}

	//匹配账号密码
	@Override
	public boolean findUser(String UserName, String UserPW) {
		boolean rs=false;
		int result = userMapper.getUser(UserName, UserPW);
		if(result>0){
			rs=true;
		}
		return rs;
	}

}
