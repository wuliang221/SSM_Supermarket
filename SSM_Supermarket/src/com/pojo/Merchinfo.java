package com.pojo;

import java.util.Date;

public class Merchinfo {
    private Integer merchID;

    private String merchName;

    private Double merchPrice;

    private Integer merchNum;

    private Integer cautionNum;

    private Integer planNum;

    private String barCode;

    private Double salesProPrice;

    private Date salesProDateS;

    private Date salesProDateE;

    private Integer allowAbate;

    private Integer allowSale;

    private Integer factoryID;

    private Integer provideID;

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
        this.merchName = merchName == null ? null : merchName.trim();
    }

    public Double getMerchPrice() {
        return merchPrice;
    }

    public void setMerchPrice(Double merchPrice) {
        this.merchPrice = merchPrice;
    }

    public Integer getMerchNum() {
        return merchNum;
    }

    public void setMerchNum(Integer merchNum) {
        this.merchNum = merchNum;
    }

    public Integer getCautionNum() {
        return cautionNum;
    }

    public void setCautionNum(Integer cautionNum) {
        this.cautionNum = cautionNum;
    }

    public Integer getPlanNum() {
        return planNum;
    }

    public void setPlanNum(Integer planNum) {
        this.planNum = planNum;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public Double getSalesProPrice() {
        return salesProPrice;
    }

    public void setSalesProPrice(Double salesProPrice) {
        this.salesProPrice = salesProPrice;
    }

    public Date getSalesProDateS() {
        return salesProDateS;
    }

    public void setSalesProDateS(Date salesProDateS) {
        this.salesProDateS = salesProDateS;
    }

    public Date getSalesProDateE() {
        return salesProDateE;
    }

    public void setSalesProDateE(Date salesProDateE) {
        this.salesProDateE = salesProDateE;
    }

    public Integer getAllowAbate() {
        return allowAbate;
    }

    public void setAllowAbate(Integer allowAbate) {
        this.allowAbate = allowAbate;
    }

    public Integer getAllowSale() {
        return allowSale;
    }

    public void setAllowSale(Integer allowSale) {
        this.allowSale = allowSale;
    }

    public Integer getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(Integer factoryID) {
        this.factoryID = factoryID;
    }

    public Integer getProvideID() {
        return provideID;
    }

    public void setProvideID(Integer provideID) {
        this.provideID = provideID;
    }
}