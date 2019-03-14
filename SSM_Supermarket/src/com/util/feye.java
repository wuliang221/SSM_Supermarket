package com.util;

public class feye {

	private int tiao; 	//总条数
	private int ye;		//总页数
	private int qi;		//查询起点
	private int dang;	//当前页码
	private int xian;   //显示条数
	
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
	public void setqidong(int tiao,int dang,int xian) {
		this.tiao=tiao;
		this.xian = xian;
		this.dang=dang;
		this.qi=(dang-1)*xian;
		if(this.tiao%this.xian == 0){
			this.ye=this.tiao/this.xian;
		}else if(this.tiao%this.xian != 0){
			this.ye=(this.tiao/this.xian)+1;
		}
	}
	
}
