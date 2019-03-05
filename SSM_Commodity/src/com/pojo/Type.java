package com.pojo;
/**
 * 商品类别
 * @author DELL
 *
 */
public class Type {
	//商品类别编号
    private Integer typeno;
    //商品类别名称
    private String typename;

    public Integer getTypeno() {
        return typeno;
    }

    public void setTypeno(Integer typeno) {
        this.typeno = typeno;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}