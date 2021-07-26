package com.hrq.practice.mode.methodfactory;

public class MysqlConnectFactory implements DataBaseFactory{
    @Override
    public Connect getConnect(String type) throws IllegalAccessException, InstantiationException {
        if ("mysql".equalsIgnoreCase(type)) {
            return MysqlConnect.class.newInstance();
        }  else {
            throw new RuntimeException("获取数据库连接异常，数据库类型未注册");
        }
    }
}
