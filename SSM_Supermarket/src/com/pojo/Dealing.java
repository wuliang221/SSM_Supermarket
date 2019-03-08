package com.pojo;

import java.util.Date;
/**
 * 交易表
 * @author DELL
 *
 */
public class Dealing {
	//交易编号
    private Integer dealingID;
    //交易金额
    private Double dealingDate;
    //交易日期
    private Date dealingPrice;
    //用户名称
    private String userName;
    //会员卡号
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