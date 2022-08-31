package com.wangyang.designpatterns.template;

public class ContraName extends Game{
    @Override
    protected void run() {
        System.out.println("启动游戏->魂斗罗");
    }

    @Override
    protected void choosePerson() {
        System.out.println("选择人物->魂斗罗");
    }

    @Override
    protected void start() {
        System.out.println("开始游戏->魂斗罗");
    }
}
