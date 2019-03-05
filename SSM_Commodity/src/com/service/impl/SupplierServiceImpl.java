package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.SupplierMapper;
import com.pojo.Supplier;
import com.service.SupplierService;
@Service
public class SupplierServiceImpl implements SupplierService {
	@Resource
	private SupplierMapper supplierMapper;

	//查询所有供应商名和编号
	public List<Supplier> allSupplier(){
		return supplierMapper.allSupplier();
	};
	//查询供应商总数
	@Override
	public int countSupplier() {
		return supplierMapper.countSupplier();
	}
	//分页查询供应商
	@Override
	public List<Supplier> findAllSupplier(Integer pageNo, Integer pageSize,
			String suppliername) {
		return supplierMapper.getAllSupplier(pageNo, pageSize, suppliername);
	}

}
