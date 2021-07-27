package com.hrq.practice.mode.proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        UserProxyHander handler = new UserProxyHander();
        handler.setEntity(new User("HRQ"));
        Save proxyInstance = (Save)Proxy.newProxyInstance(UserProxyHander.class.getClassLoader(),
                User.class.getInterfaces(), handler);
        proxyInstance.saveEntity();
    }
}
