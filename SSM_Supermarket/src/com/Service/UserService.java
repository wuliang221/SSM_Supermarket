package com.Service;

import com.pojo.User;

public interface UserService {


			//查询用户名放入session
			public User user(String UserName);
			
			//匹配账号密码
			public boolean findUser(String UserName,String UserPW);

}
