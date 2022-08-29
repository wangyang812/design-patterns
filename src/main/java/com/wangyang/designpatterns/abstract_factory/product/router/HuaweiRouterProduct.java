package com.wangyang.designpatterns.abstract_factory.product.router;

import com.wangyang.designpatterns.abstract_factory.product.router.AbstractRouterProduct;

public class HuaweiRouterProduct extends AbstractRouterProduct {
    @Override
    public void openWifi() {
        System.out.println("华为路由器打开wifi");
    }
}
