package com.pojo;

public class Worker {
    private Integer workerno;

    private Integer adminno;

    private String workername;

    private String workersex;

    private String workerphone;

    private Integer workersalary;

    private String workerpwd;

    public Integer getWorkerno() {
        return workerno;
    }

    public void setWorkerno(Integer workerno) {
        this.workerno = workerno;
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
        this.workername = workername == null ? null : workername.trim();
    }

    public String getWorkersex() {
        return workersex;
    }

    public void setWorkersex(String workersex) {
        this.workersex = workersex == null ? null : workersex.trim();
    }

    public String getWorkerphone() {
        return workerphone;
    }

    public void setWorkerphone(String workerphone) {
        this.workerphone = workerphone == null ? null : workerphone.trim();
    }

    public Integer getWorkersalary() {
        return workersalary;
    }

    public void setWorkersalary(Integer workersalary) {
        this.workersalary = workersalary;
    }

    public String getWorkerpwd() {
        return workerpwd;
    }

    public void setWorkerpwd(String workerpwd) {
        this.workerpwd = workerpwd == null ? null : workerpwd.trim();
    }
}