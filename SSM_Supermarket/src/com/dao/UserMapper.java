package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.User;


public interface UserMapper {
	//查询用户名放入session
	public User user(@Param("UserName")String UserName);
	//匹配账号密码是否有误
	public int getUser(@Param("UserName")String UserName,@Param("UserPW")String UserPW);
	//查询员工总数
	public int userCount();
	//查询所有的员工信息
	public List<User> userAll(@Param("UserName")String UserName,@Param("UserStyle")Integer UserStyle,@Param("pageNo")String pageNo,
								@Param("pageSize")String pageSize);
	
	public int updateUser(@Param("UserName")String UserName,@Param("UserStyle")Integer UserStyle,@Param("userPW")String userPW);
	
	
	
}