package com.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Dealing;
import com.util.feye;

public interface DealingService {

	//查询交易记录数量
	public int selectDealingSL(String memberID);
	
	//根据条件分页查询交易记录数量
	public List<Dealing> selectDealing(String memberID,int qi,int xian);
	
	//根据会员卡查看交易金额
	public Dealing dealingOne(String memberCard);
}
