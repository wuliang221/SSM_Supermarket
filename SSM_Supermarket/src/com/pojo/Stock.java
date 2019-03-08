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
    //入库数量
    private Integer merchNum;
    //单额
    private Double merchPrice;
    //总额
    private Double totalPrice;
    //入库日期
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

    public Integer getMerchNum() {
        return merchNum;
    }

    public void setMerchNum(Integer merchNum) {
        this.merchNum = merchNum;
    }

    public Double getMerchPrice() {
        return merchPrice;
    }

    public void setMerchPrice(Double merchPrice) {
        this.merchPrice = merchPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
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
}