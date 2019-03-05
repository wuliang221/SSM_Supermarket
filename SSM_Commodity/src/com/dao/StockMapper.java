package com.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Stock;


public interface StockMapper {
	//查询所有进货的数量
	public int countStock();
	/**
	 * 分页查询所有的进货信息
	 * @param pageNo（页码）
	 * @param pageSize（显示数）
	 * @param workerName（员工名字）
	 * @param supplierName（供应商名字）
	 * @param stockDate（进货日期）
	 * @return
	 */
	
	public List<Stock> getAllStock(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,
									@Param("workername")String workername,@Param("suppliername")String suppliername,
									@Param("stockdate")Date stockdate);
	/**
	 * 添加进货信息
	 * @param stockno（进货单号）
	 * @param goodsno（商品编号）
	 * @param supplierno（供应商编号）
	 * @param workerno（员工编号）
	 * @param stockcount（个数）
	 * @param stocklastinprise（进货总价）
	 * @param stockdate（进货日期）
	 * @return
	 */
	
	public int addStock(@Param("stockno")Integer stockno,@Param("goodsno")Integer goodsno,
						@Param("supplierno")Integer supplierno,@Param("workerno")Integer workerno,
						@Param("stockcount")Integer stockcount,@Param("stocklastinprise")Double stocklastinprise,
						@Param("stockdate")Date stockdate);
	
	/**
	 * 根据销售单号修改销售信息
	 */
	public int updateStockformation(@Param("stockno")Integer stockno,@Param("goodsno")Integer goodsno,
			@Param("supplierno")Integer supplierno,@Param("workerno")Integer workerno,
			@Param("stockcount")Integer stockcount,@Param("stocklastinprise")Double stocklastinprise,
			@Param("stockdate")Date stockdate);
	
	/**
	 * 根据进货单号查询进货信息
	 * @param stockno（进货单号）
	 * @return
	 */
	
	public Stock Stock(@Param("stockno")Integer stockno);
	
	/**
	 * 根据员工名查询进货信息
	 * @Param workerName（员工名字）
	 * @return
	 */
	
	public Stock workerStock(@Param("workerName")String workerName);
	
	/**
	 * 根据进货日期查询进货信息
	 * @Param stockdate（进货日期）
	 * @return
	 */
	
	public Stock dateStock(@Param("stockdate")Date stockdate);
	
	/**
	 * 根据进货单号删除进货信息
	 * @Param stockno（进货单号） 
	 * @return
	 */
	
	public int delStock(@Param("stockno")Integer stockno);
	
	
}