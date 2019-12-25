package com.youzhong.entity;

import java.util.Date;

public class Student {
    private Integer id;

    private String name;

    private Date comtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getComtime() {
        return comtime;
    }

    public void setComtime(Date comtime) {
        this.comtime = comtime;
    }


}