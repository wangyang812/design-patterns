package com.wangyang.designpatterns.abstract_factory.product.phone;



public class XiaomiPhoneProduct extends AbstractPhoneProduct{

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
