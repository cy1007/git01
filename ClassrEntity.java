package com.bk.entity;

public class ClassrEntity {
    private int classid;//教室编号
    private String ckname;//教室名称
    private int ckstate;//教室状态
    private  int cknum;//可容纳人数

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getCkname() {
        return ckname;
    }

    public void setCkname(String ckname) {
        this.ckname = ckname;
    }

    public int getCkstate() {
        return ckstate;
    }

    public void setCkstate(int ckstate) {
        this.ckstate = ckstate;
    }

    public int getCknum() {
        return cknum;
    }

    public void setCknum(int cknum) {
        this.cknum = cknum;
    }

    @Override
    public String toString() {
        return "ClassrEntity{" +
                "classid=" + classid +
                ", ckname='" + ckname + '\'' +
                ", ckstate=" + ckstate +
                ", cknum=" + cknum +
                '}';
    }
}
