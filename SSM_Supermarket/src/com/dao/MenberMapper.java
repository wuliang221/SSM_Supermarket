package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Menber;


public interface MenberMapper {
	
	//查询会员总数
	public int count(@Param("memberPhone")String memberPhone);
	
	//查询所有会员或者单个会员
	public List<Menber> gerAllMeber(@Param("memberPhone")String memberPhone,@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	
	//添加会员信息
	public int addMenber(@Param("memberCard")String memberCard,@Param("memberName")String memberName,@Param("membersite")String membersite,
			@Param("memberPhone")String memberPhone,@Param("totalCost")Double totalCost);
	
	//删除会员
	public int delMenber(@Param("memberID")Integer memberID);
	
	//修改会员信息
	public int updateMenber(@Param("memberID")Integer memberID,@Param("memberCard")String memberCard,@Param("memberName")String memberName,@Param("membersite")String membersite,
			@Param("memberPhone")String memberPhone,@Param("totalCost")Double totalCost);
}