package com.wangyang.designpatterns.static_proxy;

public class Test {

    public static void main(String[] args) {
        ProxyCarDriverDriver driver = new ProxyCarDriverDriver(new RealCarDriverDriver());
        driver.drive("155555");
    }
}
