package com.pojo;

import java.util.Date;

public class Sale {
    private Integer saleID;

    private Integer merChID;

    private Date saleDate;

    private Integer saleNum;

    private Double salePrice;

    public Integer getSaleID() {
        return saleID;
    }

    public void setSaleID(Integer saleID) {
        this.saleID = saleID;
    }

    public Integer getMerChID() {
        return merChID;
    }

    public void setMerChID(Integer merChID) {
        this.merChID = merChID;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
}