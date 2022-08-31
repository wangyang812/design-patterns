package com.wangyang.designpatterns.state;

public class NewThreadState extends ThreadState {


    @Override
    public void doAction() {
        System.out.println(StateEnum.NEW);
    }

    @Override
    public void changeState(ThreadContext context) {
        context.setThreadState(new RunnableThreadState());
    }
}
