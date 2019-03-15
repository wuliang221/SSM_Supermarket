package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.ProvideService;
import com.alibaba.fastjson.JSON;
import com.pojo.Provide;
import com.util.PageSupport;
@Controller
@RequestMapping("/GYS")
public class JLProvideController {
	@Resource
	private ProvideService provideService;
	
	//分页查询供应商信息
	@RequestMapping("/GYSselect.html")
	public String GYSselect(@RequestParam(value = "GYSprovideName",required = false)String GYSprovideName,
								@RequestParam(value = "pageNo",required = false)String pageNo,
								Model model){
		


		int result = provideService.count(GYSprovideName);
		if (pageNo == null || pageNo == "") {
			pageNo = "1";
		}
		int currPageNo = Integer.parseInt(pageNo);
		if (currPageNo < 1) {
			currPageNo = 1;
		}
		System.out.println(currPageNo);
		PageSupport ps = new PageSupport();
		ps.setPageSize(7);
		ps.setTotalCount(result);
		if (currPageNo > ps.getTotalPageCount()) {
			currPageNo = ps.getTotalPageCount();
		}
		ps.setCurrPageNo(currPageNo);
		int index = (ps.getCurrPageNo() - 1) * ps.getPageSize();
		if (index < 0) {
			index = 1;
		}
		System.out.println("==========================" + (ps.getCurrPageNo() - 1)
				* ps.getPageSize());

		List<Provide> allProvide = provideService.getAll(GYSprovideName, index, ps.getPageSize());
		model.addAttribute("GYSprovideName", GYSprovideName);
		model.addAttribute("allProvide", allProvide);
		model.addAttribute("ps", ps);
		return "JL/Table/TableGYS_Provide";
		
		
	}
	//添加供应商信息
	@RequestMapping("/del.json")
	@ResponseBody
	public Object addProvide(@RequestParam("provideID")Integer provideID){
		boolean result=false;
		String json="";
		if(provideID!=null){
			result=provideService.del(provideID);
			if(result){
				json="success";
			}
		}
		return JSON.toJSONString(json);
		
	}

	//删除供应商信息
	@RequestMapping("/add.json")
	@ResponseBody
	public Object delProvide(Provide provide){
		boolean result=false;
		String json="";
		if(provide!=null){
			result=provideService.add(provide);
			if(result){
				json="success";
			}
		}
		return JSON.toJSONString(json);
		
	}
}
