package com.pattern.test;

import com.pattern.strategy.Duck;
import com.pattern.strategy.MallardDuck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chenyuchao on 2016/9/30.
 */
public class StrategyTest{
    public static void main(String [] args){
        Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
