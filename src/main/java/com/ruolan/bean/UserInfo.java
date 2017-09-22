package com.ruolan.bean;

import java.util.Date;

public class UserInfo {

    private int userId;
    private String username;
    private Date modifyDate;
    private String email;
    private Date registerData;
    private int level;
    private double money;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisterData() {
        return registerData;
    }

    public void setRegisterData(Date registerData) {
        this.registerData = registerData;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", modifyDate=" + modifyDate +
                ", email='" + email + '\'' +
                ", registerData=" + registerData +
                ", level=" + level +
                '}';
    }
}
