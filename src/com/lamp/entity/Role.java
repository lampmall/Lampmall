package com.lamp.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
public class Role implements Serializable{
    private int id;
    private String role;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Role(int id, String role, String description) {

        this.id = id;
        this.role = role;
        this.description = description;
    }

    public Role() {

    }
}
