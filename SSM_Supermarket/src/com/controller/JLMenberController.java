package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.MenberService;
import com.pojo.Menber;
import com.util.PageSupport;
@Controller
@RequestMapping("/JL")
public class JLMenberController {
	@Resource
	private MenberService menberService;
	
	/**
	 * 经理查询会员信息
	 * @param pageNo
	 * @param jlMenberPhone
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/Menber.html")
	public String workerAll(@RequestParam(value="pageNo",required = false)String pageNo,
							@RequestParam(value="jlMenberPhone",required=false)String jlMenberPhone,
							Model model){
		
		

		int result = menberService.count(jlMenberPhone);
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

		List<Menber> allMenber = menberService.gerAllMeber(jlMenberPhone, index, ps.getPageSize());
		model.addAttribute("jlMenberPhone", jlMenberPhone);
		model.addAttribute("allMenber", allMenber);
		model.addAttribute("ps", ps);
		return "JL/Table/TableYG_Menber";
		
	}
	

}
