package com.Service.Impl;

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

}
