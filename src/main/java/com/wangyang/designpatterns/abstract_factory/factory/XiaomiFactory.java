package com.wangyang.designpatterns.abstract_factory.factory;

import com.wangyang.designpatterns.abstract_factory.product.router.AbstractRouterProduct;
import com.wangyang.designpatterns.abstract_factory.product.router.XiaomiRouterProduct;
import com.wangyang.designpatterns.factory_method.product.AbstractPhoneProduct;
import com.wangyang.designpatterns.factory_method.product.XiaomiPhoneProduct;

public class XiaomiFactory extends AbstractFactory{


    @Override
    public AbstractPhoneProduct productPhone() {
        return new XiaomiPhoneProduct();
    }

    @Override
    public AbstractRouterProduct productRouter() {
        return new XiaomiRouterProduct();
    }
}
