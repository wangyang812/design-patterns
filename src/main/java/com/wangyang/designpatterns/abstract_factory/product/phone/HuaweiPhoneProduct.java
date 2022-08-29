package com.wangyang.designpatterns.abstract_factory.product.phone;

public class HuaweiPhoneProduct extends AbstractPhoneProduct{
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
