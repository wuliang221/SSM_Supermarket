package com.dao;

import org.apache.ibatis.annotations.Param;

import com.pojo.Admin;


public interface AdminMapper {
	//根据ID查询管理权限
	public Admin getAdmin(@Param("adminno")Integer adminno);
   
}