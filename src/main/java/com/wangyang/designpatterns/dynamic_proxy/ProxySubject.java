package com.wangyang.designpatterns.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxySubject implements InvocationHandler {

    private Object realSubject;

    public ProxySubject(Object realSubject) {
        this.realSubject = realSubject;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(realSubject, args);
    }

    public static Object getProxy(Object realSubject) {
        Class<?> subjectClass = realSubject.getClass();
        return Proxy.newProxyInstance(subjectClass.getClassLoader(), subjectClass.getInterfaces(), new ProxySubject(realSubject));
    }
}
