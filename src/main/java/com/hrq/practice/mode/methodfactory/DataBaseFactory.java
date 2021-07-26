package com.hrq.practice.mode.methodfactory;

public interface DataBaseFactory {
    public Connect getConnect(String type) throws IllegalAccessException, InstantiationException;
}
