package com.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Sale;


public interface SaleService {
	
	//根据交易编号查询所有交易记录详情
	public List<Sale> selectSaledealingID(int dealingID);
	
	//查询商品销售图表记录详情 
	public List<Sale> selectSaleTABLE();
	
	//图表数据查询半年收入
	public List<Sale> SaleTBjin();
	
}