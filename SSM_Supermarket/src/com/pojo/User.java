package com.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户表
 * @author DELL
 *
 */
public class User {
	//用户编号
    private Integer userID;
    //用户名
    private String userName;
    //用户密码
    private String userPW;
    //用户权限
    private Integer userStyle;
    //用户手机
    private String userPhone;
    //用户住址
    private String userAddress;
    //用户入职时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userDate;
    //性别
    private String userSex;
    //年龄
    private Integer userAge;
    
    
    public Date getUserDate() {
		return userDate;
	}

	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	

   
	

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW == null ? null : userPW.trim();
    }

    public Integer getUserStyle() {
        return userStyle;
    }

    public void setUserStyle(Integer userStyle) {
        this.userStyle = userStyle;
    }
}