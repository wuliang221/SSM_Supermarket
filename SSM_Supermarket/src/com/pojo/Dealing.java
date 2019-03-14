package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 交易表
 * @author DELL
 *
 */
public class Dealing {
	//交易编号
    private Integer dealingID;
    //交易金额
    private Double dealingPrice;
    //交易日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dealingDate;
    
  //交易日期字符串
    private String dealingStringDate;
    
    public String getDealingStringDate() {
		return dealingStringDate;
	}

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


    public Double getDealingPrice() {
		return dealingPrice;
	}

	public void setDealingPrice(Double dealingPrice) {
		this.dealingPrice = dealingPrice;
	}

	public Date getDealingDate() {
		return dealingDate;
	}

	public void setDealingDate(Date dealingDate) {
		this.dealingDate = dealingDate;
		this.dealingStringDate = new SimpleDateFormat("yyyy-MM-dd").format(dealingDate);
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