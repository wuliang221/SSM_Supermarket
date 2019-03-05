package com.pojo;
/**
 * 商品信息表
 * @author Lu
 *
 */
public class Goods {
	//商品编号
    private Integer goodsno;
    //类别编号
    private Integer typeno;
    //供应商编号
    private Integer supplierno;
    //商品名
    private String goodsname;
    //规格(个、瓶、颗、件)
    private String goodsnorm;
    //单位(克、千克)
    private String goodsunit;
    //数量
    private Integer goodscount;
    //售价
    private Double goodsoutprise;
    //进价
    private Double goodsinprise;
    //供应商名称
    private String supplierName;
	//类别名称
    private String typeName;
    

    public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

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