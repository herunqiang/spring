package com.hrq.practice.mode.methodfactory;


public class MysqlConnect implements Connect {
    @Override
    public void connectDatabase() {
        System.out.println("mysql数据库连接成功");
    }
}
