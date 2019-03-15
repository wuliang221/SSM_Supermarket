package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.DealingService;
import com.util.feye;

@Controller
@RequestMapping("/JL")
public class JYDealingConeroller {

	@Resource
	private DealingService dealingService;
	
	@RequestMapping("/Dealing.html")
	public String selectDealing(@RequestParam(value="pageNo",required = false)String pageNo,
								@RequestParam(value="memberID",required = false)String memberID,
								Model model){
		//获取总页数
		int SL=dealingService.selectDealingSL(memberID);
		if(null == pageNo){
			pageNo="1";
		}
		Integer page=new Integer(pageNo);
		//实例化分页工具
		feye fy=new feye();
		fy.setqidong(SL,page,7);
		//查询交易数据
		model.addAttribute("dealing",dealingService.selectDealing(memberID,fy.getQi(),fy.getXian()));
		model.addAttribute("fy", fy);
		//判断是否返回查找条件
		if(memberID !="" && memberID != null){
			model.addAttribute("goodsName",memberID);
		}
		return "JL/Table/TableJY_Dealing";
	}
}
