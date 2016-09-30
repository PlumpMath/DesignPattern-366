package com.pattern.strategy;

/**
 * Created by chenyuchao on 2016/9/30.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can't fly");
    }
}
