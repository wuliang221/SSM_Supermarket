package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Dealing;
import com.util.feye;



public interface DealingMapper {

	//查询交易记录数量
	public int selectDealingSL(@Param("memberID")String memberID);
	
	//根据条件分页查询交易记录数量
	public List<Dealing> selectDealing(@Param("memberID")String memberID,@Param("qi")int qi,@Param("xian")int xian);
}