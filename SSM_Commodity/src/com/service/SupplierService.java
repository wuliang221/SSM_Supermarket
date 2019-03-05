package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Supplier;

public interface SupplierService {
	
	//查询所有供应商名和编号
	public List<Supplier> allSupplier();
	/**
	 * 查询供应商总数
	 * @return
	 */
	public int countSupplier();
	/**
	 * 分页查询供应商
	 */
	public List<Supplier> findAllSupplier(Integer pageNo,Integer pageSize,String suppliername);
}
