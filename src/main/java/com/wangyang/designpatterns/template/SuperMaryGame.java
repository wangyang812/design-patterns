package com.wangyang.designpatterns.template;

public class SuperMaryGame extends Game{
    @Override
    protected void run() {
        System.out.println("启动游戏->超级玛丽");
    }

    @Override
    protected void choosePerson() {
        System.out.println("选择人物->超级玛丽");
    }

    @Override
    protected void start() {
        System.out.println("开始游戏->超级玛丽");
    }

    @Override
    protected void end() {
        System.out.println("结束游戏->超级玛丽");
    }
}
