package com.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Service.SaleService;
import com.dao.DealingMapper;
import com.dao.SaleMapper;
import com.pojo.Sale;

@Service
public class SaleServiceImpl implements SaleService {

	@Resource
	private SaleMapper saleMapper;
	
	public List<Sale> selectSaledealingID(int dealingID) {
		return saleMapper.selectSaledealingID(dealingID);
	}
	
	//查询商品销售图表记录详情 
	public List<Sale> selectSaleTABLE(){
		return saleMapper.selectSaleTABLE();
	}

}
