package com.pattern.strategy;

/**
 * Created by chenyuchao on 2016/9/30.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("MuteQuack");
    }
}
