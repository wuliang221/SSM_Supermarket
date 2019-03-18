package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.MerchinfoService;
import com.pojo.Menber;
import com.pojo.Merchinfo;
import com.util.PageSupport;
import com.util.feye;
@Controller
@RequestMapping("/Merchin")
public class JLMerchinfoController {
	@Resource
	private MerchinfoService merchinfoService;
	

	//分页查询商品信息
	@RequestMapping("/MerchinSelect.html")
	public String selectMerchin(@RequestParam(value="pageNo",required = false)String pageNo,
								@RequestParam(value="MerchinName",required = false)String MerchinName,
								Model model){

		int result = merchinfoService.count(MerchinName);
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

		List<Merchinfo> allMerchinfo = merchinfoService.merchinfo(MerchinName, index, ps.getPageSize());
		model.addAttribute("Merchinfo", allMerchinfo);
		model.addAttribute("MerchinName", MerchinName);
		model.addAttribute("ps", ps);
		return "JL/Table/TableSP_Merchinfo";
	}
	

}
