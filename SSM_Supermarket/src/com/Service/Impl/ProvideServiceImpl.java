package com.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Service.ProvideService;
import com.dao.ProvideMapper;
import com.pojo.Provide;
@Service
public class ProvideServiceImpl implements ProvideService {
	
	@Resource
	private ProvideMapper provideMapper;

	@Override
	public int count(String provideName) {
		return provideMapper.count(provideName);
	}

	@Override
	public List<Provide> getAll(String provideName, Integer pageNo,
			Integer pageSize) {
		return provideMapper.getAllProvide(provideName, pageNo, pageSize);
	}

	@Override
	public boolean add(Provide provide) {
		boolean result=false;
		int rs=provideMapper.addAllprovide(provide);
		if(rs>0){
			result=true;
		}
		return result;
	}

	@Override
	public boolean update(Provide provide) {
		boolean result=false;
		int rs=provideMapper.updateProvide(provide);
		if(rs>0){
			result=true;
		}
		return result;
	}

	@Override
	public boolean del(Integer provideID) {
		boolean result=false;
		int rs=provideMapper.delProvide(provideID);
		if(rs>0){
			result=true;
		}
		return result;
	}

	/**
	 * 查询所有的供应商提供下拉
	 */
	@Override
	public List<Provide> allpro() {
		return provideMapper.allpro();
	}

}
