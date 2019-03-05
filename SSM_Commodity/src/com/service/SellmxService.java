package com.service;

import java.util.Date;
import java.util.List;

import com.pojo.Sellmx;

public interface SellmxService {

	// 查询销售商品的总数
	public int countSell();

	/**
	 * 查询所有的商品信息
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @param goodsName
	 * @param workerName
	 * @param sellno
	 * @param sellmxdate
	 * @return
	 */
	public List<Sellmx> getAllSellmx(Integer pageNo, Integer pageSize,
			Integer goodsno, Integer workerno, Integer sellno, Date sellmxdate);

	/**
	 * 添加销售信息
	 * 
	 * @param sellmxno
	 * @param goodsno
	 * @param workerno
	 * @param sellno
	 * @param sellmxcount
	 * @param sellmxzprise
	 * @param sellmxdate
	 * @return
	 */

	public int addSellmx(Integer sellmxno, Integer goodsno, Integer workerno,
			Integer sellno, Integer sellmxcount, Double sellmxzprise,
			Date sellmxdate);
	
	/**
	 * 根据销售单号修改销售信息
	 * @param sellmxno
	 * @param goodsno
	 * @param workerno
	 * @param sellno
	 * @param sellmxcount
	 * @param sellmxzprise
	 * @param sellmxdate
	 * @return
	 */
	public int updateSellmx(Integer sellmxno,Integer goodsno,Integer workerno,
							Integer sellno,Integer sellmxcount,Double sellmxzprise,
							Date sellmxdate);

	/**
	 * 根据销售单号查询销售信息
	 * 
	 * @param sellmxno
	 * @return
	 */
	public Sellmx sellmx(Integer sellmxno);

	/**
	 * 根据员工编号查询销售信息
	 * 
	 * @param workerno
	 * @return
	 */

	public Sellmx workersellmx(Integer workerno);

	/**
	 * 根据销售单号删除销售信息
	 * 
	 * @param sellmxno
	 * @return
	 */
	public int delSellmx(Integer sellmxno);
	
}
