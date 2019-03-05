package com.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.StockMapper;
import com.pojo.Stock;
import com.service.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Resource
	private StockMapper stockMapper;

	/**
	 * 查询所有的进货数量
	 */
	@Override
	public int countStock() {
		return stockMapper.countStock();
	}

	/**
	 * 分页查询所有的进货信息
	 */
	@Override
	public List<Stock> findAllStock(Integer pageNo, Integer pageSize,
			String workerName, String supplierName, Date stockDate) {
		return stockMapper.getAllStock(pageNo, pageSize, workerName,
				supplierName, stockDate);
	}

	/**
	 * 根据进货单号查询进货信息
	 */
	@Override
	public Stock Stock(Integer stockno) {
		// TODO Auto-generated method stub
		return stockMapper.Stock(stockno);
	}

	/**
	 * 添加进货信息
	 */
	@Override
	public int addStock(Integer stockno, Integer goodsno, Integer supplierno,
			Integer workerno, Integer stockcount, Double stocklastinprise,
			Date stockdate) {
		// TODO Auto-generated method stub
		return stockMapper.addStock(stockno, goodsno, supplierno, workerno,
				stockcount, stocklastinprise, stockdate);
	}

	/**
	 * 根据员工名查询进货信息
	 */
	@Override
	public Stock workerStock(String workerName) {
		// TODO Auto-generated method stub
		return stockMapper.workerStock(workerName);
	}

	/**
	 * 根据进货日期查询进货信息
	 */
	@Override
	public Stock dateStock(Date stockdate) {
		// TODO Auto-generated method stub
		return stockMapper.dateStock(stockdate);
	}

	/**
	 * 根据进货单号删除进货信息
	 */
	@Override
	public int delStock(Integer stockno) {
		// TODO Auto-generated method stub
		return stockMapper.delStock(stockno);
	}

	/**
	 * 根据进货单号修改进货信息
	 */
	@Override
	public int updateStock(Integer stockno, Integer goodsno,
			Integer supplierno, Integer workerno, Integer stockcount,
			Double stocklastinprise, Date stockdate) {
		// TODO Auto-generated method stub
		return stockMapper.updateStockformation(stockno, goodsno, supplierno,
				workerno, stockcount, stocklastinprise, stockdate);
	}

}
