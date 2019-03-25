package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Sale;


public interface SaleMapper {
	
	//根据交易编号查询所有交易记录详情
	public List<Sale> selectSaledealingID(@Param("dealingID")int dealingID);
	
	//查询商品销售图表记录详情 
	public List<Sale> selectSaleTABLE();
	
}