package com.wangyang.designpatterns.state;

public class ThreadContext {


    private StateEnum stateEnum;

    private ThreadState threadState = new NewThreadState();

    public void setThreadState(ThreadState threadState) {
        this.threadState = threadState;
    }

    public void setStateEnum(StateEnum stateEnum) {
        this.stateEnum = stateEnum;
    }

    public StateEnum getStateEnum() {
        return stateEnum;
    }

    public ThreadState getThreadState() {
        return threadState;
    }



    public void changeState() {
        threadState.changeState(this);
    }

    public void doAction() {
        threadState.doAction();
    }
}
