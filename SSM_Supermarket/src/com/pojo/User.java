package com.pojo;

import java.util.Date;

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
    private String UserPhone;
    //用户住址
    private String UserAddress;
    //用户入职时间
    private Date Useraddtime;

    public String getUserPhone() {
		return UserPhone;
	}

	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}

	public String getUserAddress() {
		return UserAddress;
	}

	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}

	public Date getUseraddtime() {
		return Useraddtime;
	}

	public void setUseraddtime(Date useraddtime) {
		Useraddtime = useraddtime;
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