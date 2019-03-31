package com.controller;



import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.SaleService;
import com.Service.StockService;
import com.alibaba.fastjson.JSON;



@Controller
@RequestMapping("/table")
public class TableConeroller {
	
	@Resource
	private SaleService saleService;
	
	@Resource
	private StockService stockService;

	//销售图表
	@RequestMapping(value="/XSTB.html")
	public String XSTB(Model model){
		System.out.println("=================================加载销售图表");
		return "JL/Table/TBTable_XS";
	}
	
	//查询销售图表所需数据
	@RequestMapping("/XSTBXJ.html")
	@ResponseBody
	public Object XSTBXJ(){
		System.out.println(JSON.toJSONString(saleService.selectSaleTABLE()));
		return JSON.toJSONString(saleService.selectSaleTABLE());
	}
	
	//资金流动图表
	@RequestMapping(value="/ZJTU.html")
	public String ZJTU(Model model){
		System.out.println("=================================加载资金流动图表");
		return "JL/Table/TBTable_ZJ";
	}
	
	//查询资金流动图表所需数据
	@RequestMapping("/ZJTBXJ.html")
	@ResponseBody
	public Object XSTBZJ(){
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("salePrice", saleService.SaleTBjin());
		map.put("totalPrice", stockService.stockTBchu());
		System.out.println(JSON.toJSONString(map));
		return JSON.toJSONString(map);
	}

}
