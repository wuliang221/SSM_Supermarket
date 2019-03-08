package com.pojo;

public class User {
    private Integer userID;

    private String userName;

    private String userPW;

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