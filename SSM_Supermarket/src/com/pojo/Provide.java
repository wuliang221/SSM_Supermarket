package com.pojo;

public class Provide {
    private Integer provideID;

    private String provideName;

    private String provideAddress;

    private String providePhone;

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