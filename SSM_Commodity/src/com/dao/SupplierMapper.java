package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Supplier;


public interface SupplierMapper {
	//查询供应商总数
	public int countSupplier();
	//分页查询供应商
	public List<Supplier> getAllSupplier(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,
			@Param("suppliername")String suppliername);
	
	// 添加供应商
	public int addSupplier(@Param("suppliername")String suppliername,
							@Param("supplieradress")String supplieradress,
							@Param("supplierpeoplename")String supplierpeoplename,
							@Param("supplierphone")String supplierphone);
	 //根据ID删除供应商
	public int delSupplier(@Param("supplierno")Integer supplierno);
	 // 根据ID修改供应商
	public int updateSupplier(@Param("supplierno")Integer supplierno,
								@Param("suppliername")String suppliername,
								@Param("supplieradress")String supplieradress,
								@Param("supplierpeoplename")String supplierpeoplename,
								@Param("supplierphone")String supplierphone);
	//查询所有供应商名和编号
	public List<Supplier> allSupplier();
	

   
	
	
}