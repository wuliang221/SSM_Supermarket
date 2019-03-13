package com.Service;

import java.util.Date;
import java.util.List;

import com.pojo.User;

public interface UserService {


			//查询用户名放入session
			public User user(String UserName);
			
			//匹配账号密码
			public boolean findUser(String UserName,String UserPW);
		
			//查询用户总数
			public int userCount(String UserName,Integer UserStyle,String UserPhone);
			
			//查询所有的员工信息
			public List<User> userAll(String UserName,Integer UserStyle,String UserPhone,Integer pageNo,Integer pageSize);
			
			//判断修改用户信息是否成功
			public boolean updateUser(String UserName,String UserSex,Integer UserAge,String UserPhone,Integer UserStyle,Date UserDate);
		
			//判断新增用户信息是否成功
			public boolean addUser(String UserName,String UserSex,Integer UserAge,String UserPhone,Integer UserStyle,Date UserDate);
		
			//判断根据ID删除用户是否成功
			public boolean delectUser(Integer userID);

}
