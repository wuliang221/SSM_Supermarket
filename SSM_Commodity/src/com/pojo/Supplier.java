package com.pojo;

public class Supplier {
    private Integer supplierno;

    private String suppliername;

    private String supplieradress;

    private String supplierpeoplename;

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