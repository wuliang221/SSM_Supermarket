package com.pojo;
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