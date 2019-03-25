package com.pojo;

import java.util.Date;
/**
 * 销售表
 * @author DELL
 *
 */
public class Sale {
	//销售编号
    private Integer saleID;
    //商品编号
    private Integer merChID;
    //商品名称
    private String merchName;
    //商品单价
    private double merchPrice;
    //销售日期
    private Date saleDate;
    //销售数量
    private Integer saleNum;
    //销售单额
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

	public String getMerchName() {
		return merchName;
	}

	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}

	public double getMerchPrice() {
		return merchPrice;
	}

	public void setMerchPrice(double merchPrice) {
		this.merchPrice = merchPrice;
	}
    
}