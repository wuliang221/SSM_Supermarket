package com.pojo;

import java.util.Date;

public class Stock {
    private Integer stockID;

    private Integer merchID;

    private Integer merchNum;

    private Double merchPrice;

    private Double totalPrice;

    private Date planDate;

    private Date stockDate;

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