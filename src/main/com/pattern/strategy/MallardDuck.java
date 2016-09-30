package com.pattern.strategy;

/**
 * Created by chenyuchao on 2016/9/30.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }
}
