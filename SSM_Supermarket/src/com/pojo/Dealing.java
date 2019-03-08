package com.pojo;

import java.util.Date;

public class Dealing {
    private Integer dealingID;

    private Double dealingDate;

    private Date dealingPrice;

    private String userName;

    private String memberCard;

    public Integer getDealingID() {
        return dealingID;
    }

    public void setDealingID(Integer dealingID) {
        this.dealingID = dealingID;
    }

    public Double getDealingDate() {
        return dealingDate;
    }

    public void setDealingDate(Double dealingDate) {
        this.dealingDate = dealingDate;
    }

    public Date getDealingPrice() {
        return dealingPrice;
    }

    public void setDealingPrice(Date dealingPrice) {
        this.dealingPrice = dealingPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMemberCard() {
        return memberCard;
    }

    public void setMemberCard(String memberCard) {
        this.memberCard = memberCard == null ? null : memberCard.trim();
    }
}