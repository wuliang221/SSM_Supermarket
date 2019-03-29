package com.dao;

import java.util.Date;
import java.util.List;





import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Stock;


public interface StockMapper {
	
	//分页查询进货订单
	public List<Stock> selectstock(@Param("StockState")String StockState,@Param("qi")int qi,@Param("tiao")int tiao);
	
	//根据条件查询进货订单数量
	public int selectstockNum(@Param("StockState")String StockState);
	
	//根据ID查询订单是否入库（where  stockState=3）
	public Stock stock(@Param("stockID") String stockID);
	
	//添加订单计划
	public int addstock(@Param("merchID")String merchID,@Param("merchNum")String merchNum,@Param("stockDate")Date data);
	
	//修改计划订单
	public int updatestock(@Param("stockID")String stockID,@Param("merchID")String merchID,@Param("merchNum")String merchNum);
	
	//删除计划订单
	public int deletestock(@Param("stockID")String stockID);
	
	//修改计划订单状态
	public int xiustock(@Param("stockID")String stockID,@Param("stockState")String stockState,@Param("planDate")Date PlanDate,@Param("runDate")Date RunDate);
}