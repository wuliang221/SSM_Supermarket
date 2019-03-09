package com.dao;

import org.apache.ibatis.annotations.Param;

import com.pojo.User;


public interface UserMapper {
	//查询用户名放入session
	public User user(@Param("UserName")String UserName);
	//匹配账号密码是否有误
	public int getUser(@Param("UserName")String UserName,@Param("UserPW")String UserPW);
	
	public int userCount();
	
	
	
}