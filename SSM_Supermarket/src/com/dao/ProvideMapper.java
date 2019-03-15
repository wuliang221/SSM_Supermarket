package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Provide;


public interface ProvideMapper {
	
	//查询供应商的总数
	 public int count(@Param("provideName")String provideName);
	 //查询所有的供应商
	 public List<Provide> getAllProvide(@Param("provideName")String provideName,@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize);
	 //添加供应商
	 public int addAllprovide(@Param("provide")Provide provide);
	 //修改供应商
	 public int updateProvide(@Param("provide")Provide provide);
	 //删除供应商
	 public int delProvide(@Param("provideID")Integer provideID);
	 
}