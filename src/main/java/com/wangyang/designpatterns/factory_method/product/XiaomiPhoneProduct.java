package com.wangyang.designpatterns.factory_method.product;

public class XiaomiPhoneProduct extends AbstractPhoneProduct {
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
