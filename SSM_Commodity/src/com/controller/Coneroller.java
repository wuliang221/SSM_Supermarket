package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/fin")
public class Coneroller {

	//登录页面
	@RequestMapping("/f")
	public String DL(){
		return "login";
	}
	
	//主页
	@RequestMapping("/z")
	public String ZY(){
		return "MyJsp";
	}

}
