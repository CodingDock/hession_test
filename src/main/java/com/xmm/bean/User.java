package com.xmm.bean;

import java.io.Serializable;

/**
 * Created by 肖明明 on 2017/1/20.
 */
public class User implements Serializable{
    private int id;
    private String userName;

    public User() {
    }

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
