package com.dao;

import org.apache.ibatis.annotations.Param;

import com.pojo.User;


public interface UserMapper {
	//查询账号密码是否匹配
	public User user(@Param("UserName")String UserName);
	//匹配账号密码是否有误
	public boolean getUser(@Param("UserName")String UserName,@Param("UserPW")String UserPW);
}