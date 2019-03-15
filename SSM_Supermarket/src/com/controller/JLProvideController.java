package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.ProvideService;
import com.pojo.Provide;
import com.util.PageSupport;
@Controller
@RequestMapping("/GYS")
public class JLProvideController {
	@Resource
	private ProvideService provideService;
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

}
