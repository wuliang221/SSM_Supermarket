package com.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Menber;

public interface MenberService {


	//查询会员总数
	public int count(String memberPhone);
	
	//查询所有会员或者单个会员
	public List<Menber> gerAllMeber(String memberPhone,Integer pageNo,Integer pageSize);
	
	//添加会员信息
	public boolean addMenber(String memberCard,String memberName,String membersite,
			String memberPhone,Double totalCost);
	
	//删除会员
	public boolean delMenber(Integer memberID);
	
	//修改会员信息
	public boolean updateMenber(Integer memberID,String memberCard,String memberName,String membersite,
			String memberPhone,Double totalCost);
	
}
