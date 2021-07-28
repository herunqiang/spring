package com.hrq.practice.mode.Strategy;

public class SHA1EntrypyStrategy implements  EncryptStrategy {
    /**
     * MS5加密算法
     * @return
     */
    @Override
    public String entrypt(String content) {
        return "SHA1:"+content;
    }
}
