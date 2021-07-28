package com.hrq.practice.mode.Strategy;

public class EncryptStrategyContext {
    private EncryptStrategy strategy;
    public EncryptStrategyContext(EncryptStrategy strategy) {
        this.strategy = strategy;
    }
    public String entry (String content){
        return this.strategy.entrypt(content);
    }
}
