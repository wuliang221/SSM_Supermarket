package com.controller;


import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.MerchinfoService;
import com.Service.StockService;
import com.alibaba.fastjson.JSON;
import com.pojo.Merchinfo;
import com.pojo.Stock;
import com.util.feye;


@Controller
@RequestMapping("/stock")
public class JLStockConeroller {

	private Logger log = Logger.getLogger(JLStockConeroller.class);

	@Resource
	private StockService stockService;
	@Resource
	private MerchinfoService merchinfoService;
	
	//分页查询进货信息
	@RequestMapping("/stock1.html")
	public String stock1(Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo) {
		System.out.println("==================进入分页查询计划进货订单");
		feye fy=new feye(stockService.selectstockNum("1"),pageNo,7);
		model.addAttribute("stock", stockService.selectstock("1", fy.getQi(), fy.getXian()));
		model.addAttribute("fy",fy);
		return "JL/Table/TableDD1_Stock";
	}
	
	//分页查询已入库进货信息
	@RequestMapping("/stock2.html")
	public String stock2(Model model,
			@RequestParam(value = "pageNo", required = false) String pageNo) {
		System.out.println("==================进入分页查询已入库进货信息");
		feye fy=new feye(stockService.selectstockNum("3"),pageNo,7);
		model.addAttribute("stock", stockService.selectstock("3", fy.getQi(), fy.getXian()));
		model.addAttribute("fy",fy);
		return "JL/Table/TableDD2_Stock";
	}
		
	//分页查询已下单进货信息
	@RequestMapping("/stock3.html")
	public String stock3(Model model,
		@RequestParam(value = "pageNo", required = false) String pageNo) {
		System.out.println("==================进入分页查询已下单进货信息");
		feye fy=new feye(stockService.selectstockNum("2"),pageNo,7);
		model.addAttribute("stock", stockService.selectstock("2", fy.getQi(), fy.getXian()));
		model.addAttribute("fy",fy);
		return "JL/Table/TableDD3_Stock";
	}

	
	//添加计划订单
	@RequestMapping("/addstock.json")
	@ResponseBody
	public Object addstock(@RequestParam("merchID") String merchID,@RequestParam("merchNum") String merchNum) {
		return JSON.toJSONString((0 < stockService.addstock(merchID,merchNum,new Date())) ? "订单添加成功" : "false");
	}
	
	//修改计划订单
	@RequestMapping("/updatestock.json")
	@ResponseBody
	public Object updatestock(@RequestParam("stockID") String stockID,@RequestParam("merchID") String merchID,
			@RequestParam("merchNum") String merchNum) {
		return JSON.toJSONString((0 < stockService.updatestock(stockID, merchID, merchNum)) ? "订单修改成功" : "false");
	}
	
	//删除计划订单
	@RequestMapping("/deletestock.json")
	@ResponseBody
	public Object deletestock(@RequestParam("stockID") String stockID) {
		return JSON.toJSONString((0 < stockService.deletestock(stockID)) ? "订单删除成功" : "false");
	}
	
	//计划订单下单状态
	@RequestMapping("/xiastock.json")
	@ResponseBody
	public Object xiastock(@RequestParam("stockID") String stockID,@RequestParam("stockState") String stockState) {
		return JSON.toJSONString((0 < stockService.xiustock(stockID, stockState,new Date(),null)) ? "下单成功！" : "false");
	}
	
	//计划订单下单状态
	@RequestMapping("/rustock.json")
	@ResponseBody
	public Object rustock(@RequestParam("stockID") String stockID,@RequestParam("stockState") String stockState) {
		int rs=stockService.xiustock(stockID, stockState,null,new Date());
		Stock result;
		boolean updatetrue=false;
		String json="false";
		Merchinfo merchinfo;
		if(1==rs){
			result=stockService.stocksuccess(stockID);
			if(result !=null){
				merchinfo=merchinfoService.merch(result.getMerchID());
				int sum=merchinfo.getMerchNum()+result.getMerchNum();
				updatetrue=merchinfoService.addMerchinfoMerchNum(result.getMerchID(), sum);
				if(updatetrue){
					json="入库成功";
				}
				
			}
		}else{
			stockService.xiustock(stockID, "2",null,new Date());
		}
		//(0 < rs) ? "入库成功！" : "false"
		return JSON.toJSONString(json);
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
	