package com.cps.redis.system.model;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;

import javax.json.JsonObject;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * redis 测试类
 * @Author Chengw on  2017/7/6 14:02
 */
public class Redis implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private Date nowTime;

    public Redis(){
        this.id = "KEY:"+UUID.randomUUID().toString();
        this.nowTime = new Date();
    }

    public Redis(String id,String name,Date nowTime){
        this.id = id;
        this.name = name;
        this.nowTime = nowTime;
    }

    public String toString(){
        return new Gson().toJson(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNowTime() {
        return nowTime;
    }

    public void setNowTime(Date nowTime) {
        this.nowTime = nowTime;
    }
}
