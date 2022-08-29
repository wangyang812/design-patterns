package com.wangyang.designpatterns.singleton;

/**
 * 确保线程安全，能做到延迟加载，但是效率不高。
 */
public class LazySingletonWithSafe {
    private static LazySingletonWithSafe singleton;

    private LazySingletonWithSafe() {};

    public static synchronized LazySingletonWithSafe getInstance() {
        if (singleton == null) {
            singleton = new LazySingletonWithSafe();
        }
        return singleton;
    }
}
