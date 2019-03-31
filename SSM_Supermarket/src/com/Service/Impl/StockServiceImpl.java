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
	public int addstock(String merchID,String merchNum,Date date){
		return stockMapper.addstock(merchID, merchNum,date);
	}
	
	@Override
	public int updatestock(String stockID,String merchID,String merchNum){
		return stockMapper.updatestock(stockID, merchID, merchNum);
	}
			
	@Override
	public int deletestock(String stockID){
		return stockMapper.deletestock(stockID);
	}
	
	//修改计划订单状态
	public int xiustock(String stockID,String stockState,Date planDate,Date runDate){
		return stockMapper.xiustock(stockID, stockState,planDate,runDate);
	}


	//判断入库是否成功的查询
	@Override
	public Stock stocksuccess(String stockID) {
		
		return stockMapper.stock(stockID);
	}
	
	//图表数据查询半年支出
	public List<Stock> stockTBchu(){
		return stockMapper.stockTBchu();
	}

}
