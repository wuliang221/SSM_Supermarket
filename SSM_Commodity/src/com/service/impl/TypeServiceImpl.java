package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.TypeMapper;
import com.pojo.Type;
import com.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {

	@Resource
	private TypeMapper typeMapper;
	
	//查询所有商品分类
	@Override
	public List<Type> alltype() {
		return typeMapper.alltype();
	}

}
