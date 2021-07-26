package com.hrq.practice.mode.simplefactory;

public class ConnectFactory {
    public static Connect getConnect(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//       return  Class.forName(type).newInstance();
        if ("oracle".equalsIgnoreCase(type)) {
            return OracleConnect.class.newInstance();
        } else if ("mysql".equalsIgnoreCase(type)) {
            return MysqlConnect.class.newInstance();
        } else {
            throw new RuntimeException("获取数据库连接异常，数据库类型未注册");
        }
    }

}
