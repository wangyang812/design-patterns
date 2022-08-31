package com.wangyang.designpatterns.state;

public class RunnableThreadState extends ThreadState {

    @Override
    public void doAction() {
        System.out.println(StateEnum.RUNNABLE);
    }

    @Override
    public void changeState(ThreadContext context) {
        context.setThreadState(new RunningThreadState());
    }
}
