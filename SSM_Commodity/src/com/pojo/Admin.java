package com.pojo;

/**
 * 职位类别类
 * @author lu
 *
 */
public class Admin {
	//职位类别号
    private Integer adminno;
    //职位名称
    private String adminname;

    public Integer getAdminno() {
        return adminno;
    }

    public void setAdminno(Integer adminno) {
        this.adminno = adminno;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }
}