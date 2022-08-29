package com.wangyang.designpatterns.dynamic_proxy;

public class Test {
    public static void main(String[] args) {
        CarDriver carDriver = (CarDriver) ProxySubject.getProxy(new RealCarDriverDriver());
        carDriver.drive("15222");
    }
}
