package com.lamp.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
public class Resource2 implements Serializable {
    private int id;
    private String task;
    private int rid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public Resource2(int id, String task, int rid) {

        this.id = id;
        this.task = task;
        this.rid = rid;
    }

    public Resource2() {

    }
}
