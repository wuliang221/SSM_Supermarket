package com.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Sellmx;


public interface SellmxMapper {
    //查询销售商品的总数
	public int countSell();
	 // 查询所有的商品信息
	
	public List<Sellmx> getAllSellmx(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,
										@Param("goodsno")Integer goodsno,@Param("workerno")Integer workerno,
										@Param("sellno")Integer sellno,@Param("sellmxdate")Date sellmxdate);
	
	/**
	 * 添加销售信息
	 */
	
	public int addSellmx(@Param("sellmxno")Integer sellmxno,@Param("goodsno")Integer goodsno,
						 @Param("workerno")Integer workerno,@Param("sellno")Integer sellno,
						 @Param("sellmxcount")Integer sellmxcount,@Param("sellmxzprise")Double sellmxzprise,
						 @Param("sellmxdate")Date sellmxdate);
	
	/**
	 * 根据销售单号修改销售信息
	 */
	public int updateSellmxformation(@Param("sellmxno")Integer sellmxno,@Param("goodsno")Integer goodsno,
									 @Param("workerno")Integer workerno,@Param("sellno")Integer sellno,
									 @Param("sellmxcount")Integer sellmxcount,@Param("sellmxzprise")Double sellmxzprise,
									 @Param("sellmxdate")Date sellmxdate);

	/**
	 * 根据销售单号查询销售信息
	 * @param sellmxno（销售明细单号）
	 * @return
	 */
	public Sellmx sellmx(@Param("sellmxno")Integer sellmxno);
	
	/**
	 * 根据员工编号查询销售信息
	 * @param workerno（员工编号）
	 * @return
	 */
	
	public Sellmx workersellmx(@Param("workerno")Integer workerno);
	
	/**
	 * 根据销售单号删除销售信息
	 * @param sellmxno（销售明细单号）
	 * @return
	 */
	public int delSellmx(@Param("sellmxno") Integer sellmxno);
	
	
}
