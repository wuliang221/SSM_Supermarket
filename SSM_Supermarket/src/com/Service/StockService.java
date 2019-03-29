package com.Service;

import java.util.Date;
import java.util.List;



import org.apache.ibatis.annotations.Param;

import com.pojo.Stock;

public interface StockService {
	
	//分页查询进货订单
	public List<Stock> selectstock(String StockState,int qi,int tiao);
	
	//根据条件查询进货订单数量
	public int selectstockNum(String StockState);
	
	//添加订单计划
	public int addstock(String merchID,String merchNum,Date stockDate);
	
	//修改计划订单
	public int updatestock(String stockID,String merchID,String merchNum);
		
	//删除计划订单
	public int deletestock(String stockID);
	
	//修改计划订单状态
	public int xiustock(String stockID,String stockState,Date planDate,Date runDate);
	
	//判断入库是否成功（stockState=3）
	public Stock stocksuccess( String stockID);

}
