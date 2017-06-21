package com.lamp.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
public class Lamp_mall implements Serializable {
    private int id;
    private String mallName;
    private String merchant;
    private String coveredArea;
    private String tel;
    private String adress;
    private String bus;
    private String adressMap;
    private String introducePath;
    private String introduce;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(String coveredArea) {
        this.coveredArea = coveredArea;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getAdressMap() {
        return adressMap;
    }

    public void setAdressMap(String adressMap) {
        this.adressMap = adressMap;
    }

    public String getIntroducePath() {
        return introducePath;
    }

    public void setIntroducePath(String introducePath) {
        this.introducePath = introducePath;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Lamp_mall(int id, String mallName, String merchant, String coveredArea, String tel, String adress, String bus, String adressMap, String introducePath, String introduce) {

        this.id = id;
        this.mallName = mallName;
        this.merchant = merchant;
        this.coveredArea = coveredArea;
        this.tel = tel;
        this.adress = adress;
        this.bus = bus;
        this.adressMap = adressMap;
        this.introducePath = introducePath;
        this.introduce = introduce;
    }

    public Lamp_mall() {

    }
}
