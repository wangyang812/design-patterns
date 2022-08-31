package com.wangyang.designpatterns.template;

public abstract class Game {

     protected abstract void run();

     protected abstract void choosePerson();

     protected abstract void start();

     protected void end() {
         System.out.println("结束游戏");
     }

     public final void play() {
         run();
         choosePerson();
         start();
         end();
     }

}
