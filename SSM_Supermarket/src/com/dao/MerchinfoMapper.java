package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Merchinfo;


public interface MerchinfoMapper {
	//查询商品总数 
	public int count(@Param("merchName")String merchName);
	//查询所有商品
	public List<Merchinfo> merchinfo(@Param("merchName")String merchName,@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	//查询打折商品
	public int salesCount(@Param("merchName")String merchName);
	//查询打折商品
	public List<Merchinfo> salesProMerchinfo(@Param("merchName")String merchName,@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	//添加商品
	public int addMerchinfo(@Param("Merchinfo")Merchinfo merchinfo);
	//删除商品
	public int delMerchinfo(@Param("merchID")Integer merchID);
	//修改商品信息
	public int updateMerchinfo(@Param("Merchinfo")Merchinfo merchinfo);
}