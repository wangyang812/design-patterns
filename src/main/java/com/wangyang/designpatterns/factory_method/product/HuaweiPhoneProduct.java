package com.wangyang.designpatterns.factory_method.product;

public class HuaweiPhoneProduct extends AbstractPhoneProduct {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
