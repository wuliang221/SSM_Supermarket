package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.UserService;
import com.alibaba.fastjson.JSON;
import com.pojo.User;

@Controller
@RequestMapping("/fin")
public class Coneroller {
	
	@Resource
	private UserService userService;

	//登录页面
	@RequestMapping("/f.html")
	public String DL(){
		return "login";
	}
	
	//主页
	@RequestMapping("/z.html")
	public String ZY(Model model){

		return "MyJsp";
	}
	
	//主页
	@RequestMapping("/z2.html")
	public String ZY2(){
		return "MyJsp";
	}
	
	//登陆判断
	@RequestMapping(value="/dl.json",method=RequestMethod.POST)
	@ResponseBody
	public Object login(@RequestParam("UserPhone")String UserPhone,@RequestParam("UserPW")String UserPW,
						HttpSession session,HttpServletRequest request){
		boolean result=userService.findUser(UserPhone, UserPW);
		User user=userService.user(UserPhone);
		String json="";
		if(result==true){
			if(user.getUserStyle()==0){
				session.setAttribute("userStyle", "总经理");
				json="session0";
			}else if(user.getUserStyle()==1){
				session.setAttribute("userStyle", "经理");
				json="session1";
			}else if(user.getUserStyle()==2){
				session.setAttribute("userStyle", "员工");
				json="session2";
			}
			session.setAttribute("userName", user.getUserName());
		}
		return JSON.toJSONString(json);
		
	}

}
