package com.pojo;

import java.util.Date;
/**
 * 进货表
 * @author lu
 *
 */
public class Stock {
	//进货单号
    private Integer stockno;
    //商品编号
    private Integer goodsno;

    //供应商编号
    private Integer supplierno;
    //员工编号
    private Integer workerno;
    //个数 
    private Integer stockcount;
    //总价
    private Double stocklastinprise;
    //进货日期
    private Date stockdate;
    
    
    /**
     * 其他表
     */
    //商品名称
    private String goodsName;
    //商品种类
    private String typeName;
    //商品规格
    private String goodsNorm;
    //重量
    private String goodsUnit;
    //数量
    private Integer goodsCount;
    //销售价
    private Double goodsOutprise;
    //进货价
    private Double goodsInprise;
    
    //供应商名称
    private String suppliername;
    
    
  //职位编号
    private Integer adminno;
    //姓名
    private String workername;
    //联系电话
    private String workerphone;
    //职位名称
    private String adminname;
    
    public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getGoodsNorm() {
		return goodsNorm;
	}

	public void setGoodsNorm(String goodsNorm) {
		this.goodsNorm = goodsNorm;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public Integer getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Double getGoodsOutprise() {
		return goodsOutprise;
	}

	public void setGoodsOutprise(Double goodsOutprise) {
		this.goodsOutprise = goodsOutprise;
	}

	public Double getGoodsInprise() {
		return goodsInprise;
	}

	public void setGoodsInprise(Double goodsInprise) {
		this.goodsInprise = goodsInprise;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public Integer getAdminno() {
		return adminno;
	}

	public void setAdminno(Integer adminno) {
		this.adminno = adminno;
	}

	public String getWorkername() {
		return workername;
	}

	public void setWorkername(String workername) {
		this.workername = workername;
	}

	public String getWorkerphone() {
		return workerphone;
	}

	public void setWorkerphone(String workerphone) {
		this.workerphone = workerphone;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

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

    public Double getStocklastinprise() {
        return stocklastinprise;
    }

    public void setStocklastinprise(Double stocklastinprise) {
        this.stocklastinprise = stocklastinprise;
    }

    public Date getStockdate() {
        return stockdate;
    }

    public void setStockdate(Date stockdate) {
        this.stockdate = stockdate;
    }
}