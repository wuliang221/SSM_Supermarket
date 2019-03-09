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
		return "denglu";
	}
	
	//员工端主页
	@RequestMapping("/z.html")
	public String ZY(Model model){
		return "MyJsp";
	}
	
	//经理端主页
	@RequestMapping("/jingli.html")
	public String ZY2(){
		return "jingli";
	}
	
	//登陆判断
	@RequestMapping(value="/dl.json",method=RequestMethod.POST)
	@ResponseBody
	public Object login(@RequestParam("UserName")String UserName,@RequestParam("UserPW")String UserPW,
						HttpSession session,HttpServletRequest request){
		boolean result=userService.findUser(UserName, UserPW);
		User user=userService.user(UserName);
		String json="";
		if(result==true){
			session.setAttribute("userStyle", user.getUserStyle());
			session.setAttribute("userName", user.getUserName());
			json="session1";
		}
		return JSON.toJSONString(json);
		
	}

}
