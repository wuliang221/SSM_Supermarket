package com.Service.Impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Service.StockService;
import com.dao.StockMapper;
import com.pojo.Stock;

@Service
public class StockServiceImpl implements StockService {

	@Resource
	private StockMapper stockMapper;
	
	
	@Override
	public List<Stock> selectstock(String StockState, int qi, int tiao) {
		return stockMapper.selectstock(StockState, qi, tiao);
	}
	
	
	@Override
	public int selectstockNum(String StockState){
		return stockMapper.selectstockNum(StockState);
	}
	
	@Override
	public int addstock(int merchID,int merchNum){
		return stockMapper.addstock(merchID, merchNum,new Date());
	}
	@Override
	public int updatestock(String stockID,int merchID,int merchNum){
		return stockMapper.updatestock(stockID, merchID, merchNum);
	}
			
	@Override
	public int deletestock(String stockID){
		return stockMapper.deletestock(stockID);
	}
	
	//修改计划订单状态
	public int xiustock(String stockID,String stockState){
		return stockMapper.xiustock(stockID, stockState);
	}

}
