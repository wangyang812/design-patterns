package com.wangyang.designpatterns.singleton;

/**
 *  1. 双重判断，延迟加载；
 *  2. 线程安全；
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {};

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
