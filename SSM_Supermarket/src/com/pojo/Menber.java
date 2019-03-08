package com.pojo;

import java.util.Date;
/**
 * 会员表
 * @author DELL
 *
 */
public class Menber {
	//会员编号
    private Integer memberID;
    //会员卡号
    private String memberCard;
    //累积消费金额
    private Double totalCost;
    //注册日期
    private Date regDate;

    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        this.memberID = memberID;
    }

    public String getMemberCard() {
        return memberCard;
    }

    public void setMemberCard(String memberCard) {
        this.memberCard = memberCard == null ? null : memberCard.trim();
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}