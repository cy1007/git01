package com.bk.entity;

import org.springframework.format.annotation.DateTimeFormat;

public class PeopleEntity {
    private int pid;//id
    private String pname;//姓名
    private String pwd;//密码
    private String psex;//性别
    private int page;//年龄
    private String ptel;//电话
    private String pbir;//生日
    private int  pflag;//0管理员 1会员 2教练

    public PeopleEntity(int pid, String pname, String pwd, String psex, int page, String ptel, String pbir, int pflag) {
        this.pid = pid;
        this.pname = pname;
        this.pwd = pwd;
        this.psex = psex;
        this.page = page;
        this.ptel = ptel;
        this.pbir = pbir;
        this.pflag = pflag;
    }

    public PeopleEntity() {
    }

    public PeopleEntity(String pname, String pwd, String psex, int page, String ptel, String pbir, int pflag) {
        this.pname = pname;
        this.pwd = pwd;
        this.psex = psex;
        this.page = page;
        this.ptel = ptel;
        this.pbir = pbir;
        this.pflag = pflag;
    }

    @Override
    public String toString() {
        return "PeopleEntity{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", psex='" + psex + '\'' +
                ", page=" + page +
                ", ptel='" + ptel + '\'' +
                ", pbir='" + pbir + '\'' +
                ", pflag=" + pflag +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPtel() {
        return ptel;
    }

    public void setPtel(String ptel) {
        this.ptel = ptel;
    }

    public String getPbir() {
        return pbir;
    }

    public void setPbir(String pbir) {
        this.pbir = pbir;
    }

    public int getPflag() {
        return pflag;
    }

    public void setPflag(int pflag) {
        this.pflag = pflag;
    }
}


