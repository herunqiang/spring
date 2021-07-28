package com.hrq.practice.mode.Strategy;

public class MD5EntrypyStrategy implements  EncryptStrategy {
    /**
     * MS5加密算法
     * @return
     */
    @Override
    public String entrypt(String content) {
        return "MD5:"+content;
    }
}
