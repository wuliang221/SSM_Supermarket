package com.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Merchinfo;

public interface MerchinfoService {
	
	//查询商品总数 
	public int count(String merchName);
	//查询所有商品
	public List<Merchinfo> merchinfo(String merchName,Integer pageNo,Integer pageSize);
	//查询打折商品
	public int salesCount(String merchName);
	//查询打折商品
	public List<Merchinfo> salesProMerchinfo(String merchName,Integer pageNo,Integer pageSize);
	//添加商品
	public boolean addMerchinfo(Merchinfo merchinfo);
	//删除商品
	public boolean delMerchinfo(Integer merchID);
	//查询单个商品信息
	public Merchinfo merch(Integer merchID);
	//修改商品信息
	public boolean updateMerchinfo(Merchinfo merchinfo);
	//查询所有商品id与商品名称
	public List<Merchinfo> selectidname();
	//修改促销商品价格，日期
	public boolean updateCX(Merchinfo merchinfo);
	//入库商品修改库存是否成功
	public boolean addMerchinfoMerchNum(Integer merchID,Integer merchNum);
	

}
