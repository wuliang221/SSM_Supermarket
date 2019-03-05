package com.dao;

import java.util.List;

import com.pojo.Type;


public interface TypeMapper {
	
	/**
	 * 查询所有商品类别
	 * @return
	 */
	public List<Type> alltype();
   
}