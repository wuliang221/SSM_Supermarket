package com.util;

public class feye {

	private int tiao; 	//总条数
	private int ye;		//总页数
	private int qi;		//查询起点
	private int dang;	//当前页码
	private int xian;   //显示条数
	
	public feye(int tiao,String dang,int xian){
		Integer da=1;
		if(null != dang && "" !=dang){
			da=new Integer(dang);
		}
		this.tiao=tiao;
		this.xian = xian;
		if(this.tiao%this.xian == 0){
			this.ye=this.tiao/this.xian;
		}else{
			this.ye=(this.tiao/this.xian)+1;
		}
		if(da > this.ye){
			this.dang=this.ye;
		}else {
			this.dang=da;
		}
		this.qi=(this.dang-1)*xian;
		
	}
	
	public int getTiao() {
		return tiao;
	}
	public int getYe() {
		return ye;
	}
	
	public int getQi() {
		return qi;
	}

	public int getDang() {
		return dang;
	}

	public int getXian() {
		return xian;
	}
	
}
