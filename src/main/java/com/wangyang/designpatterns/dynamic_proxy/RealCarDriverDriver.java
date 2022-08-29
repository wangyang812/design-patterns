package com.wangyang.designpatterns.dynamic_proxy;


public class RealCarDriverDriver implements CarDriver {

    @Override
    public void drive(String license) {
        System.out.println("有证驾驶" + license + "开车回家");
    }
}
