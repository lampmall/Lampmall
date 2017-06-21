package com.lamp.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
public class User implements Serializable {
    private int id;
    private String name;
    private String password;
    private String email;
    private String phone;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(int id, String name, String password, String email, String phone) {

        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public User() {

    }
}
