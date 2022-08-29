package com.wangyang.designpatterns.abstract_factory;

import com.wangyang.designpatterns.abstract_factory.factory.AbstractFactory;
import com.wangyang.designpatterns.abstract_factory.factory.XiaomiFactory;
import com.wangyang.designpatterns.abstract_factory.product.router.AbstractRouterProduct;

public class Test {

    public static void main(String[] args) {
        AbstractFactory factory = new XiaomiFactory();
        AbstractRouterProduct product = factory.productRouter();
        product.openWifi();
    }
}
