package com.wangyang.designpatterns.factory_method.factory;

import com.wangyang.designpatterns.factory_method.product.AbstractPhoneProduct;
import com.wangyang.designpatterns.factory_method.product.XiaomiPhoneProduct;

public class XiaomiPhoneFactory extends AbstractPhoneFactory{
    @Override
    public AbstractPhoneProduct productPhone() {
        return new XiaomiPhoneProduct();
    }
}
