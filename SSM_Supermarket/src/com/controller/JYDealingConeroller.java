package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;


import com.Service.DealingService;
import com.Service.SaleService;
import com.alibaba.fastjson.JSON;
import com.pojo.Dealing;
import com.util.feye;

@Controller
@RequestMapping("/JL")
public class JYDealingConeroller {

	@Resource
	private DealingService dealingService;
	
	@Resource
	private SaleService saleService;
	
	
	//分页查询交易信息
	@RequestMapping("/Dealing.html")
	public String selectDealing(@RequestParam(value="pageNo",required = false)String pageNo,
								@RequestParam(value="memberID",required = false)String memberID,
								Model model){
		System.out.println("============分页查询交易信息");
		//实例化分页工具
		feye fy=new feye(dealingService.selectDealingSL(memberID),pageNo,7);
		//查询交易数据
		model.addAttribute("dealing",dealingService.selectDealing(memberID,fy.getQi(),fy.getXian()));
		model.addAttribute("fy", fy);
		model.addAttribute("goodsName",memberID);
		return "JL/Table/TableJY_Dealing";
	}
	
	//查询交易详情
	@RequestMapping("/Sale.html")
	@ResponseBody
	public Object Sale(@RequestParam(value="dealingID",required = true)String dealingID){
		return JSON.toJSONString(JSON.toJSON(saleService.selectSaledealingID(new Integer(dealingID))));
	}
	
}
