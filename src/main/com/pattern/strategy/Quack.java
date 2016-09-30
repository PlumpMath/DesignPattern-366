package com.pattern.strategy;

/**
 * Created by chenyuchao on 2016/9/30.
 */
public class Quack implements QuackBehavior {
    public void quack(){
        System.out.println("Quack");
    }
}
