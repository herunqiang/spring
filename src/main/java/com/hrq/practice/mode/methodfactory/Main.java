package com.hrq.practice.mode.methodfactory;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MysqlConnectFactory mysqlConnectFactory = new MysqlConnectFactory();
        Connect mysqlConnect = mysqlConnectFactory.getConnect("mysql");
        mysqlConnect.connectDatabase();

        OracleConnectFactory oracleConnectFactory = new OracleConnectFactory();
        Connect oracleConnect = oracleConnectFactory.getConnect("oraclE");
        oracleConnect.connectDatabase();
    }
}
