package com.Service.Impl;

import java.util.Date;
import java.util.List;

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

	//查询用户的数量
	@Override
	public int userCount(String UserName, Integer UserStyle, String UserPhone) {
		return userMapper.userCount(UserName, UserStyle, UserPhone);
	}

	//分页查询所有的用户
	@Override
	public List<User> userAll(String UserName, Integer UserStyle,
			String UserPhone, Integer pageNo, Integer pageSize) {
		return userMapper.userAll(UserName, UserStyle, UserPhone, pageNo, pageSize);
	}
	//判断是修改成功
	@Override
	public boolean updateUser(String UserName, String UserPhone,
			Integer UserStyle, String userPW, String UserAddress) {
		boolean rs=false;
		int result = userMapper.updateUser(UserName, UserPhone, UserStyle, userPW, UserAddress);
		if(result>0){
			rs=true;
		}
		return rs;
	}
	//判断是否添加成功
	@Override
	public boolean addUser(String UserName,String UserSex,Integer UserAge,String UserPhone,Integer UserStyle,Date UserDate) {
		boolean rs=false;
		int result = userMapper.addUser(UserName, UserSex, UserAge, UserPhone, UserStyle, UserDate);
		if(result>0){
			rs=true;
		}
		return rs;
	}
	//判断是否删除成功
	@Override
	public boolean delectUser(Integer userID) {
		boolean rs=false;
		int result = userMapper.delectUser(userID);
		if(result>0){
			rs=true;
		}
		return rs;
	}

}
