package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.MerchinfoService;
import com.Service.ProvideService;
import com.Service.UserService;
import com.alibaba.fastjson.JSON;
import com.pojo.Provide;
import com.pojo.User;

@Controller
@RequestMapping("/fin")
public class Coneroller {
	
	@Resource
	private UserService userService;
	@Resource
	private ProvideService provideService;
	@Resource
	private MerchinfoService merchinfoService;

	//登录页面
	@RequestMapping("/DL.html")
	public String DL(){
		return "DL";
	}
	
	//员工端主页
	@RequestMapping("/YG.html")
	public String YG(Model model){
		return "YG";
	}
	
	//经理端主页
	@RequestMapping("/JL.html")
	public String JL(Model model){
		List<Provide> pro=provideService.allpro();
		model.addAttribute("pro", pro);
		model.addAttribute("merchinfo", merchinfoService.selectidname());
		return "JL";
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
			/*if(user.getUserStyle()==0){
				session.setAttribute("userStyle", "总经理");
				json="success0";
			}else */
			if(user.getUserStyle()==1){
				session.setAttribute("userStyle", "经理");
				json="success1";
			}else if(user.getUserStyle()==2){
				session.setAttribute("userStyle", "员工");
				json="success2";
			}
			session.setAttribute("userName", user.getUserName());
		}
		return JSON.toJSONString(json);
		
	}

}
