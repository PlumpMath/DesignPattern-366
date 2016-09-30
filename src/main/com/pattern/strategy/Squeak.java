package com.pattern.strategy;

/**
 * Created by chenyuchao on 2016/9/30.
 */
public class Squeak implements QuackBehavior {
    public void quack(){
        System.out.println("Squeak");
    }
}
