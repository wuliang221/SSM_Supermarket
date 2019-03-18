package com.controller;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/table")
public class TableConeroller {
	
	

	//销售图表
	@RequestMapping(value="/XSTB.html")
	public String XSTB(Model model){
		System.out.println("=================================加载销售图表");
		return "JL/Table/TBTable_XS";
	}
	
	//资金流动图表
	@RequestMapping(value="/ZJTU.html")
	public String ZJTU(Model model){
		System.out.println("=================================加载资金流动图表");
		return "JL/Table/TBTable_ZJ";
	}

}
