package com.wangyang.designpatterns.state;

public class BlockedThreadState extends ThreadState{

    @Override
    public void doAction() {
        System.out.println(StateEnum.BLOCKED);
    }

    @Override
    public void changeState(ThreadContext context) {
        if (StateEnum.RUNNING.equals(context.getStateEnum())) {
            context.setThreadState(new RunningThreadState());
        } else if (StateEnum.DEAD.equals(context.getStateEnum())) {
            context.setThreadState(new DeadThreadState());
        }
    }
}
