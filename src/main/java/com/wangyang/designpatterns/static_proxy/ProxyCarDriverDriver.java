package com.wangyang.designpatterns.static_proxy;

public class ProxyCarDriverDriver implements CarDriver {

    private CarDriver carDriver;

    public ProxyCarDriverDriver(CarDriver carDriver) {
        this.carDriver = carDriver;
    }

    @Override
    public void drive(String license) {
        System.out.println("我来代驾了");
        carDriver.drive(license);
        System.out.println("代驾结束");
    }
}
