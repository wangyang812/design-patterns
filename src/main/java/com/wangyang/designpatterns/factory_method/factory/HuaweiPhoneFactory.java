package com.wangyang.designpatterns.factory_method.factory;

import com.wangyang.designpatterns.factory_method.product.AbstractPhoneProduct;
import com.wangyang.designpatterns.factory_method.product.HuaweiPhoneProduct;

public class HuaweiPhoneFactory extends AbstractPhoneFactory {
    @Override
    public AbstractPhoneProduct productPhone() {
        return new HuaweiPhoneProduct();
    }
}
