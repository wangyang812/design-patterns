package com.wangyang.designpatterns.state;

public class RunningThreadState extends ThreadState{


    @Override
    public void doAction() {
        System.out.println(StateEnum.RUNNING);
    }

    @Override
    public void changeState(ThreadContext context) {
        if (StateEnum.BLOCKED.equals(context.getStateEnum())) {
            context.setThreadState(new BlockedThreadState());
        } else if (StateEnum.DEAD.equals(context.getStateEnum())) {
            context.setThreadState(new DeadThreadState());
        }
    }
}
