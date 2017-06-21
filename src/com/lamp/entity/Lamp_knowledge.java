package com.lamp.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
public class Lamp_knowledge implements Serializable {
    private int id;
    private String name;
    private String lead;
    private String lampTime;
    private String lampType;
    private String lampStyle;
    private String lightType;
    private String apply;
    private String imgPath;
    private String publicPraise;
    private int ktid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getLampTime() {
        return lampTime;
    }

    public void setLampTime(String lampTime) {
        this.lampTime = lampTime;
    }

    public String getLampType() {
        return lampType;
    }

    public void setLampType(String lampType) {
        this.lampType = lampType;
    }

    public String getLampStyle() {
        return lampStyle;
    }

    public void setLampStyle(String lampStyle) {
        this.lampStyle = lampStyle;
    }

    public String getLightType() {
        return lightType;
    }

    public void setLightType(String lightType) {
        this.lightType = lightType;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getPublicPraise() {
        return publicPraise;
    }

    public void setPublicPraise(String publicPraise) {
        this.publicPraise = publicPraise;
    }

    public int getKtid() {
        return ktid;
    }

    public void setKtid(int ktid) {
        this.ktid = ktid;
    }

    public Lamp_knowledge(int id, String name, String lead, String lampTime, String lampType, String lampStyle, String lightType, String apply, String imgPath, String publicPraise, int ktid) {

        this.id = id;
        this.name = name;
        this.lead = lead;
        this.lampTime = lampTime;
        this.lampType = lampType;
        this.lampStyle = lampStyle;
        this.lightType = lightType;
        this.apply = apply;
        this.imgPath = imgPath;
        this.publicPraise = publicPraise;
        this.ktid = ktid;
    }

    public Lamp_knowledge() {

    }
}
