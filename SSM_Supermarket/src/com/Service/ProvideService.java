package com.Service;

import java.util.List;

import com.pojo.Provide;

public interface ProvideService {
	

	//查询供应商的总数
	 public int count(String provideName);
	 //查询所有的供应商
	 public List<Provide> getAll(String provideName,Integer pageNo,Integer pageSize);
	 //添加供应商
	 public boolean add(Provide provide);
	 //修改供应商
	 public boolean update(Provide provide);
	 //删除供应商
	 public boolean del(Integer provideID);
	 

}
