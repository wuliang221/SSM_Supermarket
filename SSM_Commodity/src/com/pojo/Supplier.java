package com.pojo;
/**
 * 供应商信息表
 * @author lu
 * 
 *
 */
public class Supplier {
	//供应商编号
    private Integer supplierno;
    //供应商名称
    private String suppliername;
    //供应商地址
    private String supplieradress;
    //联系人姓名
    private String supplierpeoplename;
    //联系人电话
    private String supplierphone;

    public Integer getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(Integer supplierno) {
        this.supplierno = supplierno;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSupplieradress() {
        return supplieradress;
    }

    public void setSupplieradress(String supplieradress) {
        this.supplieradress = supplieradress == null ? null : supplieradress.trim();
    }

    public String getSupplierpeoplename() {
        return supplierpeoplename;
    }

    public void setSupplierpeoplename(String supplierpeoplename) {
        this.supplierpeoplename = supplierpeoplename == null ? null : supplierpeoplename.trim();
    }

    public String getSupplierphone() {
        return supplierphone;
    }

    public void setSupplierphone(String supplierphone) {
        this.supplierphone = supplierphone == null ? null : supplierphone.trim();
    }
}