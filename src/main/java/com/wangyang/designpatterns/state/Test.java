package com.wangyang.designpatterns.state;

public class Test {

    public static void main(String[] args) {

        ThreadContext context = new ThreadContext();
        context.doAction();

        context.changeState();
        context.doAction();

        context.changeState();
        context.doAction();

        context.setStateEnum(StateEnum.BLOCKED);
        context.changeState();
        context.doAction();

        context.setStateEnum(StateEnum.DEAD);
        context.changeState();
        context.doAction();
    }



}
