package com.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.Service.DealingService;
import com.dao.DealingMapper;
import com.pojo.Dealing;
import com.util.feye;


@Service
public class DealingServicelmpl implements DealingService {

	@Resource
	private DealingMapper dealingMapper;
	
	//查询交易记录数量
	@Override
	public int selectDealingSL(String memberID) {
		return dealingMapper.selectDealingSL(memberID);
	}

	//根据条件分页查询交易记录数量
	@Override
	public List<Dealing> selectDealing(String memberID,int qi,int xian) {
		return dealingMapper.selectDealing(memberID,qi,xian);
	}

}
