package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.UserService;
import com.pojo.User;
import com.util.PageSupport;

@Controller
@RequestMapping("/yg")
public class YGWorkerController {
	
	
	@Resource
	private UserService userService;
	@RequestMapping(value="/worker.html")
	public String workerAll(@RequestParam(value="pageNo",required = false)String pageNo,
							@RequestParam(value="ygworkername",required=false)String ygworkername,
							@RequestParam(value="UserPhone",required=false)String UserPhone,
							@RequestParam(value="UserStyle",required=false)Integer UserStyle,Model model){
		
		

		int result = userService.userCount(ygworkername, UserStyle, UserPhone);
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

		List<User> userAllFind = userService.userAll(ygworkername, UserStyle, UserPhone, index, ps.getPageSize());
		System.out.println(userAllFind);
		model.addAttribute("ygworkername", ygworkername);
		model.addAttribute("UserPhone", UserPhone);
		model.addAttribute("UserStyle", UserStyle);
		model.addAttribute("userAllFind", userAllFind);
		model.addAttribute("ps", ps);
		return "YG/Table/TableYG1";
		
	}
	

}
