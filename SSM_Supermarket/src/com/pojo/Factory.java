package com.pojo;
/**
 * 厂商表
 * @author DELL
 *
 */
public class Factory {
	//厂商编号
    private Integer factoryID;
    //厂商名称
    private String factoryName;
    //厂商地址
    private String factoryAddress;
    //厂商电话
    private String factoryPhone;

    public Integer getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(Integer factoryID) {
        this.factoryID = factoryID;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress == null ? null : factoryAddress.trim();
    }

    public String getFactoryPhone() {
        return factoryPhone;
    }

    public void setFactoryPhone(String factoryPhone) {
        this.factoryPhone = factoryPhone == null ? null : factoryPhone.trim();
    }
}