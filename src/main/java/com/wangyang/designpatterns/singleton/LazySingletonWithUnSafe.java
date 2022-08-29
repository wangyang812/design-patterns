package com.wangyang.designpatterns.singleton;

/**
 * 是线程不安全的，但是可以做到延迟加载。
 */
public class LazySingletonWithUnSafe {

    private static LazySingletonWithUnSafe singleton;

    private LazySingletonWithUnSafe() {};

    public static LazySingletonWithUnSafe getInstance() {
        if (singleton == null) {
            singleton =  new LazySingletonWithUnSafe();
        }
        return singleton;
    }
}
