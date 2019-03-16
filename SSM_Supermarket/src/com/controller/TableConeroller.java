package com.controller;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/table")
public class TableConeroller {


	//JL员工信息表
	@RequestMapping(value="/User")
	@ResponseBody
	public void BG11(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================加载员工数据表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TableYG_User.jsp").forward(request, response);
	}
	//YG员工信息表
		@RequestMapping(value="/YGUser")
		@ResponseBody
		public void BG12(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			System.out.println("================================================================加载员工数据表");
			request.getRequestDispatcher("/WEB-INF/jsp/YG/Table/TableYG1.jsp").forward(request, response);
		}
	
	//会员信息表
	@RequestMapping(value="/Menber")
	@ResponseBody
	public void Menber(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================加载会员数据表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TableHY_Menber.jsp").forward(request, response);
	}
	
	//供应商信息表
	@RequestMapping(value="/Provide")
	@ResponseBody
	public void BG21(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================加载供应商信息表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TableGYS_Provide.jsp").forward(request, response);
	}
	
	//商品信息表
	@RequestMapping(value="/Merchinfo")
	@ResponseBody
	public void Merchinfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================加载商品信息表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TableSP_Merchinfo.jsp").forward(request, response);
	}
	
	//商品促销信息表
	@RequestMapping(value="/MerchinfoCX")
	@ResponseBody
	public void MerchinfoCX(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================加载商品促销信息表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TableSP_MerchinfoCX.jsp").forward(request, response);
	}
	
	//交易信息表
	@RequestMapping(value="/Dealing")
	@ResponseBody
	public void Dealing(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================加载交易信息表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TableJY_Dealing.jsp").forward(request, response);
	}
	
	//销售图表
	@RequestMapping(value="/XSTB")
	@ResponseBody
	public void XSTB(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("================================================================加载销售图表");
		request.getRequestDispatcher("/WEB-INF/jsp/JL/Table/TBTable_XS.jsp").forward(request, response);
	}
	

}
