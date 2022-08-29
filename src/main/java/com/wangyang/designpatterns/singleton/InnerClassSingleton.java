package com.wangyang.designpatterns.singleton;

/**
 *  1. 利用了classloader机制来保证初始化 instance 时只有一个线程，线程安全；
 *  2. 只有通过显式调用 getInstance 方法时，才会显式装载静态内部类，从而实例化instance，延迟加载。
 */
public class InnerClassSingleton {

    private static class InnerClass {
        private final static InnerClassSingleton SINGLETON = new InnerClassSingleton();
    }

    private InnerClassSingleton() {};

    public static InnerClassSingleton getInstance() {
        return InnerClass.SINGLETON;
    }
}
