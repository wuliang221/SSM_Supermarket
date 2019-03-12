package com.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.User;


public interface UserMapper {
	
	//查询用户名放入session
	public User user(@Param("UserPhone")String UserPhone);
	
	//匹配账号密码是否有误
	public int getUser(@Param("UserPhone")String UserPhone,@Param("UserPW")String UserPW);
	
	//查询员工总数
	public int userCount(@Param("UserName")String UserName,@Param("UserStyle")Integer UserStyle,
						@Param("UserPhone")String UserPhone);

	//查询所有的员工信息
	public List<User> userAll(@Param("UserName")String UserName,@Param("UserStyle")Integer UserStyle,
			@Param("UserPhone")String UserPhone,@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);

	//修改用户信息
	public int updateUser(@Param("UserName")String UserName,@Param("UserPhone")String UserPhone,
								@Param("UserStyle")Integer UserStyle,@Param("UserPW")String UserPW,
								@Param("UserAddress")String UserAddress);

	//新增用户信息
	public int addUser(@Param("UserName")String UserName,@Param("UserSex")String UserSex,
						@Param("UserAge")Integer UserAge,@Param("UserPhone")String UserPhone,
						@Param("UserStyle")Integer UserStyle,@Param("UserDate")Date UserDate
						);
	
	
	//根据ID删除用户
	public int delectUser(@Param("userID")Integer userID);
	
	
}