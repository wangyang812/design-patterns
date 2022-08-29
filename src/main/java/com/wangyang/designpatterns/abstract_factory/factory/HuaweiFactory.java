package com.wangyang.designpatterns.abstract_factory.factory;

import com.wangyang.designpatterns.abstract_factory.product.router.AbstractRouterProduct;
import com.wangyang.designpatterns.abstract_factory.product.router.XiaomiRouterProduct;
import com.wangyang.designpatterns.factory_method.product.AbstractPhoneProduct;
import com.wangyang.designpatterns.factory_method.product.HuaweiPhoneProduct;

public class HuaweiFactory extends AbstractFactory{
    @Override
    public AbstractPhoneProduct productPhone() {
        return new HuaweiPhoneProduct();
    }

    @Override
    public AbstractRouterProduct productRouter() {
        return new XiaomiRouterProduct();
    }
}
