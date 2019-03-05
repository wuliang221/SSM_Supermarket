package com.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.SellmxMapper;
import com.pojo.Sellmx;
import com.service.SellmxService;

@Service
public class SellmxServiceImpl implements SellmxService {
	@Resource
	private SellmxMapper sellmxMapper;

	/**
	 * 查询销售的总数量
	 */
	@Override
	public int countSell() {
		return sellmxMapper.countSell();
	}

	/**
	 * 分页查询销售的信息
	 */
	@Override
	public List<Sellmx> getAllSellmx(Integer pageNo, Integer pageSize,
			Integer goodsName, Integer workerName, Integer sellno,
			Date sellmxdate) {
		return sellmxMapper.getAllSellmx(pageNo, pageSize, goodsName,
				workerName, sellno, sellmxdate);
	}

	/**
	 * 添加销售信息
	 */
	@Override
	public int addSellmx(Integer sellmxno, Integer goodsno, Integer workerno,
			Integer sellno, Integer sellmxcount, Double sellmxzprise,
			Date sellmxdate) {
		// TODO Auto-generated method stub
		return sellmxMapper.addSellmx(sellmxno, goodsno, workerno, sellno,
				sellmxcount, sellmxzprise, sellmxdate);
	}
	
	/**
	 * 根据销售单号修改销售信息
	 */
	@Override
	public int updateSellmx(Integer sellmxno, Integer goodsno,
			Integer workerno, Integer sellno, Integer sellmxcount,
			Double sellmxzprise, Date sellmxdate) {
		// TODO Auto-generated method stub
		return sellmxMapper.updateSellmxformation(sellmxno, goodsno, workerno, sellno, 
												  sellmxcount, sellmxzprise, sellmxdate);
	}

	/**
	 * 根据销售单号查询销售信息
	 */
	@Override
	public Sellmx sellmx(Integer sellmxno) {
		// TODO Auto-generated method stub
		return sellmxMapper.sellmx(sellmxno);
	}

	/**
	 * 根据员工编号查询销售信息
	 */
	@Override
	public Sellmx workersellmx(Integer workerno) {
		// TODO Auto-generated method stub
		return sellmxMapper.workersellmx(workerno);
	}

	/**
	 * 根据销售单号删除销售信息
	 */
	@Override
	public int delSellmx(Integer sellmxno) {
		// TODO Auto-generated method stub
		return sellmxMapper.delSellmx(sellmxno);
	}	

}
