package com.controller;



import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@RequestMapping("/add")
public class addConeroller {
	
	//员工添加add页面
	@RequestMapping(value="/addYG.html")
	@ResponseBody
	public void addSP(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("===========================================员工添加add页面加载");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/add/addYG_User.jsp").forward(request, response);
	}
	
	//供应商添加add页面
	@RequestMapping(value="/addGYS.html")
	@ResponseBody
	public void addGYS(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================供应商添加add页面");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/add/addGYS_Provide.jsp").forward(request, response);
	}
	
//商品添加add页面
	@RequestMapping(value="/addSP.html")
	@ResponseBody
	public void add3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================商品添加add页面");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/add/addSP_Merchinfo.jsp").forward(request, response);
	}
	
	
	
}


