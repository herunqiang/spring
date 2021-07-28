package com.hrq.practice.mode.Strategy;

public class Main {
    public static void main(String[] args) {
        EncryptStrategyContext context = new EncryptStrategyContext(new MD5EntrypyStrategy());
        System.out.println(context.entry("helloworld"));
    }
}
