package com.dao;

import java.util.Date;
import java.util.List;




import org.apache.ibatis.annotations.Param;

import com.pojo.Stock;


public interface StockMapper {
	
	//分页查询进货订单
	public List<Stock> selectstock(@Param("StockState")String StockState,@Param("qi")int qi,@Param("tiao")int tiao);
	
	
	//根据条件查询进货订单数量
	public int selectstockNum(@Param("StockState")String StockState);
	
	
	//添加订单计划
	public int addstock(@Param("merchID")int merchID,@Param("merchNum")int merchNum,@Param("stockDate")Date data);
	
	
}