package com.pojo;

public class Goods {
    private Integer goodsno;

    private Integer typeno;

    private Integer supplierno;

    private String goodsname;

    private String goodsnorm;

    private String goodsunit;

    private Integer goodscount;

    private Double goodsoutprise;

    private Double goodsinprise;

    public Integer getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(Integer goodsno) {
        this.goodsno = goodsno;
    }

    public Integer getTypeno() {
        return typeno;
    }

    public void setTypeno(Integer typeno) {
        this.typeno = typeno;
    }

    public Integer getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(Integer supplierno) {
        this.supplierno = supplierno;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsnorm() {
        return goodsnorm;
    }

    public void setGoodsnorm(String goodsnorm) {
        this.goodsnorm = goodsnorm == null ? null : goodsnorm.trim();
    }

    public String getGoodsunit() {
        return goodsunit;
    }

    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit == null ? null : goodsunit.trim();
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Double getGoodsoutprise() {
        return goodsoutprise;
    }

    public void setGoodsoutprise(Double goodsoutprise) {
        this.goodsoutprise = goodsoutprise;
    }

    public Double getGoodsinprise() {
        return goodsinprise;
    }

    public void setGoodsinprise(Double goodsinprise) {
        this.goodsinprise = goodsinprise;
    }
}