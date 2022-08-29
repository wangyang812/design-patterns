package com.wangyang.designpatterns.abstract_factory.factory;

import com.wangyang.designpatterns.abstract_factory.product.router.AbstractRouterProduct;
import com.wangyang.designpatterns.factory_method.product.AbstractPhoneProduct;

public abstract class AbstractFactory {

    public abstract AbstractPhoneProduct productPhone();

    public abstract AbstractRouterProduct productRouter();

}
