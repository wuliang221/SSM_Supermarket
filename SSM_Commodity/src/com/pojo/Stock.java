package com.pojo;

import java.util.Date;

public class Stock {
    private Integer stockno;

    private Integer goodsno;

    private Integer supplierno;

    private Integer workerno;

    private Integer stockcount;

    private Integer stocklastinprise;

    private Date stockdate;

    public Integer getStockno() {
        return stockno;
    }

    public void setStockno(Integer stockno) {
        this.stockno = stockno;
    }

    public Integer getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(Integer goodsno) {
        this.goodsno = goodsno;
    }

    public Integer getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(Integer supplierno) {
        this.supplierno = supplierno;
    }

    public Integer getWorkerno() {
        return workerno;
    }

    public void setWorkerno(Integer workerno) {
        this.workerno = workerno;
    }

    public Integer getStockcount() {
        return stockcount;
    }

    public void setStockcount(Integer stockcount) {
        this.stockcount = stockcount;
    }

    public Integer getStocklastinprise() {
        return stocklastinprise;
    }

    public void setStocklastinprise(Integer stocklastinprise) {
        this.stocklastinprise = stocklastinprise;
    }

    public Date getStockdate() {
        return stockdate;
    }

    public void setStockdate(Date stockdate) {
        this.stockdate = stockdate;
    }
}