package com.controller;



import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/table")
public class TableConeroller {


	//员工信息表
	@RequestMapping(value="/User")
	@ResponseBody
	public void BG11(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================员工数据表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TableYG_User.jsp").forward(request, response);
	}
	
	//会员信息表
	@RequestMapping(value="/Menber")
	@ResponseBody
	public void Menber(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================会员数据表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TableYG_Menber.jsp").forward(request, response);
	}
	
	//供应商信息表
	@RequestMapping(value="/bg21")
	@ResponseBody
	public void BG21(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/TableGYS1.jsp").forward(request, response);
	}
	
	//供应商信息表
	@RequestMapping(value="/bg31")
	@ResponseBody
	public void BG31(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/TableGYS1.jsp").forward(request, response);
	}
	
	//供应商信息表
	@RequestMapping(value="/bg41")
	@ResponseBody
	public void BG41(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("======================================================================");
		request.getRequestDispatcher("/WEB-INF/jsp/Table/TableYG1.jsp").forward(request, response);
	}

}
