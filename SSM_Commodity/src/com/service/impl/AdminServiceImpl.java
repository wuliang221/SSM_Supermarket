package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.AdminMapper;
import com.pojo.Admin;
import com.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	@Resource
	private AdminMapper adminMapper;
	@Override
	public Admin findAdm(Integer adminno) {
		return adminMapper.getAdmin(adminno);
	}

}
