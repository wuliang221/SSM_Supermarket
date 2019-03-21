package com.Service;

import java.util.List;
import com.pojo.Stock;

public interface StockService {
	
	//分页查询进货订单
	public List<Stock> selectstock(String StockState,int qi,int tiao);
	
	//根据条件查询进货订单数量
	public int selectstockNum(String StockState);
	
	//添加订单计划
	public int addstock(int merchID,int merchNum);

}
