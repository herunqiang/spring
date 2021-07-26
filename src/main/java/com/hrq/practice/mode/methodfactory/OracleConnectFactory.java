package com.hrq.practice.mode.methodfactory;

public class OracleConnectFactory implements DataBaseFactory{
    @Override
    public Connect getConnect(String type) throws IllegalAccessException, InstantiationException {
        if ("oracle".equalsIgnoreCase(type)) {
            return OracleConnect.class.newInstance();
        }  else {
            throw new RuntimeException("获取数据库连接异常，数据库类型未注册");
        }
    }
}
