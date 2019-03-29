package com.pojo;

import java.util.Date;
/**
 * 进货入库表
 * @author DELL
 *
 */
public class Stock {
	//入库编号
    private Integer stockID;
    //入库商品编号
    private Integer merchID;
    //商品名称
    private String merchName;
    //入库数量
    private Integer merchNum;
    //总额
    private Double totalPrice;
    //入库日期
    private Date runDate;
    //下单日期
    private Date planDate;
    //计划进货日期
    private Date stockDate;
    //入库状态
    private Integer stockState;
    
    
	public Integer getStockID() {
		return stockID;
	}
	public void setStockID(Integer stockID) {
		this.stockID = stockID;
	}
	public Integer getMerchID() {
		return merchID;
	}
	public void setMerchID(Integer merchID) {
		this.merchID = merchID;
	}
	public String getMerchName() {
		return merchName;
	}
	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}
	public Integer getMerchNum() {
		return merchNum;
	}
	public void setMerchNum(Integer merchNum) {
		this.merchNum = merchNum;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getRunDate() {
		return runDate;
	}
	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}
	public Date getPlanDate() {
		return planDate;
	}
	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	public Date getStockDate() {
		return stockDate;
	}
	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}
	public Integer getStockState() {
		return stockState;
	}
	public void setStockState(Integer stockState) {
		this.stockState = stockState;
	}
	@Override
	public String toString() {
		return "Stock [stockID=" + stockID + ", merchID=" + merchID
				+ ", merchName=" + merchName + ", merchNum=" + merchNum
				+ ", totalPrice=" + totalPrice + ", runDate=" + runDate
				+ ", planDate=" + planDate + ", stockDate=" + stockDate
				+ ", stockState=" + stockState + "]";
	}
    
    

    
}