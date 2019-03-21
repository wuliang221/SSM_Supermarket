package com.controller;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.StockService;
import com.alibaba.fastjson.JSON;
import com.util.feye;


@Controller
@RequestMapping("/stock")
public class JLStockConeroller {

	private Logger log = Logger.getLogger(JLStockConeroller.class);

	@Resource
	private StockService stockService;

	/**
	 * 分页查询进货信息
	 */
	@RequestMapping("/stock1.html")
	public String stockselect(
			Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo) {
		System.out.println("==================进入分页查询计划进货订单");
		feye fy=new feye(stockService.selectstockNum("1"),pageNo,7);
		model.addAttribute("stock", stockService.selectstock("1", fy.getQi(), fy.getXian()));
		model.addAttribute("fy",fy);
		return "JL/Table/TableDD_Stock";
	}

	
	//添加计划订单
	@RequestMapping("addstock.json")
	@ResponseBody
	public String addstock(@RequestParam("merchID") String merchID,@RequestParam("merchNum") String merchNum) {
		return (0 < stockService.addstock(new Integer(merchID), new Integer(merchNum))) ? "计划订单添加成功" : "false";
	}

	/**
	 * 根据进货单号修改进货信息
	 *//*
	@RequestMapping("/updatestock.html")
	@ResponseBody
	public Object updatestock(@RequestParam("stockno") Integer stockno,
			@RequestParam("goodsno") Integer goodsno,
			@RequestParam("supplierno") Integer supplierno,
			@RequestParam("workerno") Integer workerno,
			@RequestParam("stockcount") Integer stockcount,
			@RequestParam("stocklastinprise") Double stocklastinprise,
			@RequestParam("stockdate") Date stockdate) {
		String json = null;
		Integer result = stockService.updateStock(stockno, goodsno, supplierno,
				workerno, stockcount, stocklastinprise, stockdate);
		if (result > 0) {
			return json = "1";

		}
		return json;

	}*/

}
	