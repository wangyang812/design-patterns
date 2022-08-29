package com.wangyang.designpatterns.abstract_factory.product.router;

import com.wangyang.designpatterns.abstract_factory.product.router.AbstractRouterProduct;

public class XiaomiRouterProduct extends AbstractRouterProduct {
    @Override
    public void openWifi() {
        System.out.println("小米路由器打开wifi");
    }
}
