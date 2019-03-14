package com.Service.Impl;

import java.util.List;

import com.Service.MenberService;
import com.pojo.Menber;

public class MenberServiceImpl implements MenberService {

	@Override
	public int count(String memberPhone) {
		return 0;
	}

	@Override
	public List<Menber> gerAllMeber(String memberPhone, Integer pageNo,
			Integer pageSize) {
		return null;
	}

	@Override
	public boolean addMenber(String memberCard, String memberName,
			String membersite, String memberPhone, Double totalCost) {
		return false;
	}

	@Override
	public boolean delMenber(Integer memberID) {
		return false;
	}

	@Override
	public boolean updateMenber(Integer memberID, String memberCard,
			String memberName, String membersite, String memberPhone,
			Double totalCost) {
		return false;
	}

}
