package com.lamp.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
public class Knowledge_type implements Serializable {
    private int id;
    private String ktName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKtName() {
        return ktName;
    }

    public void setKtName(String ktName) {
        this.ktName = ktName;
    }

    public Knowledge_type(int id, String ktName) {

        this.id = id;
        this.ktName = ktName;
    }

    public Knowledge_type() {

    }
}
