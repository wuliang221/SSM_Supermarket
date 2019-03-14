package com.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Service.MenberService;
import com.dao.MenberMapper;
import com.pojo.Menber;
@Service
public class MenberServiceImpl implements MenberService {
	@Resource
	private MenberMapper menberMapper;
	//查询会员总数
	@Override
	public int count(String memberPhone) {
		return menberMapper.count(memberPhone);
	}
	//查询所有会员或者单个会员
	@Override
	public List<Menber> gerAllMeber(String memberPhone, Integer pageNo,
			Integer pageSize) {
		return menberMapper.gerAllMeber(memberPhone, pageNo, pageSize);
	}
	//添加会员信息
	@Override
	public boolean addMenber(String memberCard, String memberName,
			String membersite, String memberPhone, Double totalCost) {
		boolean result=false;
		int rs=menberMapper.addMenber(memberCard, memberName, membersite, memberPhone, totalCost);
		if(rs>0){
			result=true;
		}
		return result;
	}
	//删除会员
	@Override
	public boolean delMenber(Integer memberID) {
		boolean result=false;
		int rs=menberMapper.delMenber(memberID);
		if(rs>0){
			result=true;
		}
		return result;
	}
	//修改会员信息
	@Override
	public boolean updateMenber(Integer memberID, String memberCard,
			String memberName, String membersite, String memberPhone,
			Double totalCost) {
		boolean result=false;
		int rs=menberMapper.updateMenber(memberID, memberCard, memberName, membersite, memberPhone, totalCost);
		if(rs>0){
			result=true;
		}
		return result;
	}

}
