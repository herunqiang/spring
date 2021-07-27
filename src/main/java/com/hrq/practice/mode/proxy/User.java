package com.hrq.practice.mode.proxy;

public class User implements Save {
    private String userName ;
    private String password ;
    @Override
    public void saveEntity() {
        System.out.println(userName + "保存成功");
    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
