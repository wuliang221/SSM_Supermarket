package com.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Service.MerchinfoService;
import com.dao.MerchinfoMapper;
import com.pojo.Merchinfo;
@Service
public class MerchinfoServiceImpl implements MerchinfoService {
	@Resource
	private MerchinfoMapper merchinfoMapper;
	/**
	 * //查询商品总数 
	 */
	@Override
	public int count(String merchName) {
		return merchinfoMapper.count(merchName);
	}
	/**
	 * //查询所有商品
	 */
	@Override
	public List<Merchinfo> merchinfo(String merchName, Integer pageNo,
			Integer pageSize) {
		return merchinfoMapper.merchinfo(merchName, pageNo, pageSize);
	}

	@Override
	public List<Merchinfo> salesProMerchinfo(String merchName, Integer pageNo,
			Integer pageSize) {
		return merchinfoMapper.salesProMerchinfo(merchName, pageNo, pageSize);
	}

	/**
	 * 添加商品
	 */
	@Override
	public boolean addMerchinfo(Merchinfo merchinfo) {
		boolean result=false;
		int rs=merchinfoMapper.addMerchinfo(merchinfo);
		if(rs>0){
			result=true;
		}
		return result;
	}
	/**
	 * 删除商品
	 */
	@Override
	public boolean delMerchinfo(Integer merchID) {
		boolean result=false;
		int rs=merchinfoMapper.delMerchinfo(merchID);
		if(rs>0){
			result=true;
		}
		return result;
	}

	/**
	 * 修改商品信息
	 */
	@Override
	public boolean updateMerchinfo(Merchinfo merchinfo) {
		boolean result=false;
		int rs=merchinfoMapper.updateMerchinfo(merchinfo);
		if(rs>0){
			result=true;
		}
		return result;
	}

	@Override
	public int salesCount(String merchName) {
		return merchinfoMapper.salesCount(merchName);
	}
	@Override
	public Merchinfo merch(Integer merchID) {
		return merchinfoMapper.merch(merchID);
	}
	
	public List<Merchinfo> selectidname(){
		return merchinfoMapper.selectidname();
	}

}
