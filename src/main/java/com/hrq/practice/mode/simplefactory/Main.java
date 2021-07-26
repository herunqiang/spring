package com.hrq.practice.mode.simplefactory;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Connect mysqlConnect = ConnectFactory.getConnect("mysql");
        Connect mysqlConnect = ConnectFactory.getConnect("com.hrq.practice.mode.simplefactory.MysqlConnect");
        mysqlConnect.connectDatabase();
    }
}
