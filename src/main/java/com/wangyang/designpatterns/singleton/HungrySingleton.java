package com.wangyang.designpatterns.singleton;

/**
 *  1. 类加载时就初始化，浪费内存，不能延迟加载；
 *  2. 基于 classloader 机制避免了多线程的同步问题，线程安全；
 *  3. 没有加锁，调用效率高。
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {};

    public static HungrySingleton getInstance() {
        return singleton;
    }

}
