package com.pojo;

import java.util.Date;
/**
 * 销售明细表
 * @author lu
 *
 */
public class Sellmx {
	//销售明细单号
    private Integer sellmxno;
    //商品编号
    private Integer goodsno;
    //员工编号
    private Integer workerno;
    //销售单号
    private Integer sellno;
    //销售个数
    private Integer sellmxcount;
    //总金额
    private Double sellmxzprise;
    //交易日期
    private Date sellmxdate;

    public Integer getSellmxno() {
        return sellmxno;
    }

    public void setSellmxno(Integer sellmxno) {
        this.sellmxno = sellmxno;
    }

    public Integer getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(Integer goodsno) {
        this.goodsno = goodsno;
    }

    public Integer getWorkerno() {
        return workerno;
    }

    public void setWorkerno(Integer workerno) {
        this.workerno = workerno;
    }

    public Integer getSellno() {
        return sellno;
    }

    public void setSellno(Integer sellno) {
        this.sellno = sellno;
    }

    public Integer getSellmxcount() {
        return sellmxcount;
    }

    public void setSellmxcount(Integer sellmxcount) {
        this.sellmxcount = sellmxcount;
    }

    public Double getSellmxzprise() {
        return sellmxzprise;
    }

    public void setSellmxzprise(Double sellmxzprise) {
        this.sellmxzprise = sellmxzprise;
    }

    public Date getSellmxdate() {
        return sellmxdate;
    }

    public void setSellmxdate(Date sellmxdate) {
        this.sellmxdate = sellmxdate;
    }
}