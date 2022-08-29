package com.wangyang.designpatterns.singleton;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> System.out.println(LazySingletonWithUnSafe.getInstance())).start();
        }

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> System.out.println(LazySingletonWithSafe.getInstance())).start();
        }

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> System.out.println(DoubleCheckSingleton.getInstance())).start();
        }

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> System.out.println(HungrySingleton.getInstance())).start();
        }

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> System.out.println(InnerClassSingleton.getInstance())).start();
        }

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> System.out.println(EnumSingleton.INSTANCE)).start();
        }

    }

}
