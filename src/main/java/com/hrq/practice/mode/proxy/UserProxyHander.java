package com.hrq.practice.mode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserProxyHander implements InvocationHandler {
    private Save entity;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        this.validateData();
        Object invoke = method.invoke(entity, args);

        return invoke;
    }
    private void validateData(){
        if (this.entity == null) {
            throw new RuntimeException("被代理对象不能为空");
        }
    }

    public Save getEntity() {
        return entity;
    }

    public void setEntity(Save entity) {
        this.entity = entity;
    }
}
