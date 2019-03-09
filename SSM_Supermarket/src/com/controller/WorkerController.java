package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.UserService;
import com.alibaba.fastjson.JSON;
import com.pojo.User;
import com.util.PageSupport;

@Controller
@RequestMapping("/worker")
public class WorkerController {
	@Resource
	private UserService userService;
	@RequestMapping(value="/worker.html")
	public String workerAll(@RequestParam(value="pageNo",required = false)String pageNo,
							@RequestParam(value="UserName",required=false)String UserName,
							@RequestParam(value="UserPhone",required=false)String UserPhone,
							@RequestParam(value="UserStyle",required=false)Integer UserStyle,Model model){
		
		

		int result = userService.userCount(UserName, UserStyle, UserPhone);
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

		List<User> userAllFind = userService.userAll(UserName, UserStyle, UserPhone, index, ps.getPageSize());
		System.out.println(userAllFind);
		model.addAttribute("UserName", UserName);
		model.addAttribute("UserPhone", UserPhone);
		model.addAttribute("UserStyle", UserStyle);
		model.addAttribute("userAllFind", userAllFind);
		model.addAttribute("ps", ps);
		return "Table/TableYG1";
		
	}
	
	@RequestMapping("/update.json")
	@ResponseBody
	public Object updateUser(@RequestParam("UserName")String UserName,@RequestParam("UserPhone")String UserPhone,
			@RequestParam("UserStyle")Integer UserStyle,@RequestParam("userPW")String userPW,
			@RequestParam("UserAddress")String UserAddress){
		boolean result=false;
		String json=null;
			result=userService.updateUser(UserName, UserPhone, UserStyle, userPW, UserAddress);
			if(result==true){
				json="success";
			}
				return JSON.toJSONString(json);
		
	}
	@RequestMapping("/add.json")
	@ResponseBody
	public Object addUser(@RequestParam("UserName")String UserName,@RequestParam("UserPhone")String UserPhone,
			@RequestParam("UserStyle")Integer UserStyle,@RequestParam("userPW")String userPW,
			@RequestParam("UserAddress")String UserAddress){
		boolean result=false;
		String json=null;
		result=userService.addUser(UserName, UserPhone, UserStyle, userPW, UserAddress);
		if(result==true){
			json="success";
		}
		return JSON.toJSONString(json);
		
	}
	@RequestMapping("/del.json")
	@ResponseBody
	public Object del(@RequestParam("userID")Integer userID){
		boolean result=false;
		String json=null;
		result=userService.delectUser(userID);
		if(result==true){
			json="success";
		}
		return JSON.toJSONString(json);
		
	}
	
	
	
	
}
