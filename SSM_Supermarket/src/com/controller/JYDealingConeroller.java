package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;






import com.Service.DealingService;
import com.pojo.Dealing;
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
		System.out.println("=====================查交易记录");
		int SL=dealingService.selectDealingSL(memberID);
		if(null == pageNo){
			pageNo="1";
		}
		Integer page=new Integer(pageNo);
		//获取总页数
		System.out.println("====================="+SL);
		//实例化分页工具
		feye fy=new feye();
		fy.setqidong(SL,page,7);
		//判断页面传入数据是否大于总页数
		if(page>fy.getYe()){
			page=fy.getYe();
		}
		//查询交易数据
		model.addAttribute("dealing",dealingService.selectDealing(memberID,fy.getQi(),fy.getXian()));
		for(Dealing dl : dealingService.selectDealing(memberID,fy.getQi(),fy.getXian())){
			System.out.println("============"+dl.getDealingPrice());
		}
		model.addAttribute("fy", fy);
		return "JL/Table/TableJY_Dealing";
	}
}
