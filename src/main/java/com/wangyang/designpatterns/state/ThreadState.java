package com.wangyang.designpatterns.state;

public abstract class ThreadState {

    public abstract void doAction();

    public abstract void changeState(ThreadContext context);


}
