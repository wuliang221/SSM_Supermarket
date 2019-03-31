package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.UserService;
import com.alibaba.fastjson.JSON;
import com.pojo.User;
import com.util.PageSupport;

@Controller
@RequestMapping("/worker")
public class JLWorkerController {
	@Resource
	private UserService userService;
	@RequestMapping(value="/worker.html")
	public String workerAll(@RequestParam(value="pageNo",required = false)String pageNo,
							@RequestParam(value="YGUserName",required=false)String YGUserName,
							@RequestParam(value="UserPhone",required=false)String UserPhone,
							@RequestParam(value="UserStyle",required=false)Integer UserStyle,Model model){
		
		

		int result = userService.userCount(YGUserName, UserStyle, UserPhone);
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

		List<User> userAllFind = userService.userAll(YGUserName, UserStyle, UserPhone, index, ps.getPageSize());
		System.out.println(userAllFind);
		model.addAttribute("YGUserName", YGUserName);
		model.addAttribute("UserPhone", UserPhone);
		model.addAttribute("UserStyle", UserStyle);
		model.addAttribute("userAllFind", userAllFind);
		model.addAttribute("ps", ps);
		return "JL/Table/TableYG_User";
		
	}
	
	@RequestMapping(value="/update.json",method=RequestMethod.POST)
	@ResponseBody
	public Object updateUser(@RequestParam("UserName")String UserName,@RequestParam("UserSex")String UserSex,
							@RequestParam("UserAge")Integer UserAge,@RequestParam("UserPhone")String UserPhone,
							@RequestParam("UserStyle")Integer UserStyle,@RequestParam("UserDate")String UserDate,
							@RequestParam("UserID")Integer UserID) throws ParseException{
		boolean result=false;
		String json=null;
		//时间转换格式
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(UserDate);
		
			result=userService.updateUser(UserName, UserSex, UserAge, UserPhone, UserStyle, date, UserID);
			if(result==true){
				json="success";
			}
				return JSON.toJSONString(json);
		
	}
	
	
	
	
	@RequestMapping(value="/add.json",method=RequestMethod.POST)
	@ResponseBody
	public Object addUser(@RequestParam("UserName")String UserName,@RequestParam("UserSex")String UserSex,
			@RequestParam("UserAge")Integer UserAge,@RequestParam("UserPhone")String UserPhone,
			@RequestParam("UserStyle")Integer UserStyle,@RequestParam("UserDate")String UserDate) throws ParseException{
		boolean result=false;
		String json=null;
		//时间转换格式
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = formatter.parse(UserDate);
		System.out.println("========================================================");
		System.out.println(UserName+UserSex+UserAge+UserPhone+UserStyle+UserDate);
		System.out.println("========================================================");
		if(UserName !="" && UserName!=null && UserAge != null && UserPhone!="" && UserPhone !=""&& UserStyle==1||UserStyle==2 &&UserDate!=""&&UserDate!=null){
			if(UserStyle==1){
				result=userService.addUser(UserName, UserSex, UserAge, UserPhone, UserStyle, date);
				if(result==true){
					json="提示："+UserName+"经理的信息添加成功！";
				}
			}else if(UserStyle==2){
				result=userService.addUser(UserName, UserSex, UserAge, UserPhone, UserStyle, date);
				if(result==true){
					json="提示："+UserName+"员工的信息添加成功！";
				}
		}
		
		}else{
			json="false";
		}
		
		return JSON.toJSONString(json);
		
	}
	@RequestMapping(value="/del.json",method=RequestMethod.POST)
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
