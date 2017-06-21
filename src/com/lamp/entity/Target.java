package com.lamp.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
public class Target implements Serializable {
    private int id;
    private String targetName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public Target(int id, String targetName) {

        this.id = id;
        this.targetName = targetName;
    }

    public Target() {

    }
}
