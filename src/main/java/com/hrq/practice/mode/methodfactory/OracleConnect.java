package com.hrq.practice.mode.methodfactory;


public class OracleConnect implements Connect {

    @Override
    public void connectDatabase() {
        //todo 连接数据库操作
        System.out.println("oracle数据库连接成功");
    }
}
