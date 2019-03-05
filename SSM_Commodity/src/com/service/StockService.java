package com.service;

import java.util.Date;
import java.util.List;

import com.pojo.Stock;

public interface StockService {
	
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
		
		public List<Stock> findAllStock(Integer pageNo,Integer pageSize,String workername,
				String suppliername,Date stockdate);

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
		
		public int addStock(Integer stockno,Integer goodsno,
							Integer supplierno,Integer workerno,
							Integer stockcount,Double stocklastinprise,
							Date stockdate);
		/**
		 * 根据进货单号修改进货信息
		 * @param stockno
		 * @param goodsno
		 * @param supplierno
		 * @param workerno
		 * @param stockcount
		 * @param stocklastinprise
		 * @param stockdate
		 * @return
		 */
		public int updateStock(Integer stockno,Integer goodsno,
							   Integer supplierno,Integer workerno,
							   Integer stockcount,Double stocklastinprise,
							   Date stockdate);
		
		/**
		 * 根据进货编号查询进货信息
		 * @param stockno（进货编号）
		 * @return
		 */
		
		public Stock Stock(Integer stockno);
		
		/**
		 * 根据员工名查询进货信息
		 * @Param workerName（员工名字）
		 * @return
		 */
		
		public Stock workerStock(String workerName);
		
		/**
		 * 根据进货日期查询进货信息
		 * @Param stockdate（进货日期）
		 * @return
		 */
		
		public Stock dateStock(Date stockdate);
		
		/**
		 * 根据进货单号删除进货信息
		 * @Param stockno（进货单号） 
		 * @return
		 */
		
		public int delStock(Integer stockno);
		
		
		
}
