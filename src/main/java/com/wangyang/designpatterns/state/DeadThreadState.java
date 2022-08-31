package com.wangyang.designpatterns.state;

public class DeadThreadState extends ThreadState{


    @Override
    public void doAction() {
        System.out.println(StateEnum.DEAD);
    }

    @Override
    public void changeState(ThreadContext context) {
        System.out.println("线程已经结束了");
    }
}
