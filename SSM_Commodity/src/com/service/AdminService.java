package com.service;

import org.apache.ibatis.annotations.Param;

import com.pojo.Admin;

public interface AdminService {
	
		//根据ID查询管理权限
		public Admin findAdm(Integer adminno);

}
