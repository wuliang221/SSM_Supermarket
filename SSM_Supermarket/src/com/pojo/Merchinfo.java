package com.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 商品信息表
 * @author DELL
 *
 */
public class Merchinfo {
	//商品编号
    private Integer merchID;
    //商品名称
    private String merchName;
    //价格
    private Double merchPrice;
    //库存数量
    private Integer merchNum;
    //库存报警数量
    private Integer cautionNum;
    //进货价
    private Double merchCost;
    //计划进货数
    private Integer planNum;
    //条形码
    private String barCode;
    //促销价格
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Double salesProPrice;
    //促销起日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date salesProDateS;
    //促销止日期
    private Date salesProDateE;
    //允许打折
    private Integer allowAbate;
    //允许销售
    private Integer allowSale;
    //供货商编号
    private Integer provideID;
    //供货商名称
    private String provideName;

    

	public Double getMerchCost() {
		return merchCost;
	}

	public void setMerchCost(Double merchCost) {
		this.merchCost = merchCost;
	}

	public String getProvideName() {
		return provideName;
	}

	public void setProvideName(String provideName) {
		this.provideName = provideName;
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

    public Integer getProvideID() {
        return provideID;
    }

    public void setProvideID(Integer provideID) {
        this.provideID = provideID;
    }
}