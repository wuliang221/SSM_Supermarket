package com.pojo;
/**
 * 供货商
 * @author DELL
 *
 */
public class Provide {
	//供货商编号
    private Integer provideID;
    //供货商名称
    private String provideName;
    //供货商地址
    private String provideAddress;
    //联系人
    private String provideContact;
    //供货商电话
    private String providePhone;

    
    public String getProvideContact() {
		return provideContact;
	}

	public void setProvideContact(String provideContact) {
		this.provideContact = provideContact;
	}

	public Integer getProvideID() {
        return provideID;
    }

    public void setProvideID(Integer provideID) {
        this.provideID = provideID;
    }

    public String getProvideName() {
        return provideName;
    }

    public void setProvideName(String provideName) {
        this.provideName = provideName == null ? null : provideName.trim();
    }

    public String getProvideAddress() {
        return provideAddress;
    }

    public void setProvideAddress(String provideAddress) {
        this.provideAddress = provideAddress == null ? null : provideAddress.trim();
    }

    public String getProvidePhone() {
        return providePhone;
    }

    public void setProvidePhone(String providePhone) {
        this.providePhone = providePhone == null ? null : providePhone.trim();
    }
}