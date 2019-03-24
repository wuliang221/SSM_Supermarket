package com.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Stock;

public interface StockService {
	
	//分页查询进货订单
	public List<Stock> selectstock(String StockState,int qi,int tiao);
	
	//根据条件查询进货订单数量
	public int selectstockNum(String StockState);
	
	//添加订单计划
	public int addstock(int merchID,int merchNum);
	
	//修改计划订单
	public int updatestock(String stockID,int merchID,int merchNum);
		
	//删除计划订单
	public int deletestock(String stockID);
	
	//修改计划订单状态
	public int xiustock(String stockID,String stockState);

}
