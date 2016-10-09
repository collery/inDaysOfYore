package com.king.strategy;

import com.king.strategy.behavior.FlyNoWay;
import com.king.strategy.behavior.Squeak;

/**
 * Created by 57011 on 2016/10/6.
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        //===========================
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new Squeak());
        mallard.performFly();
        mallard.performQuack();
    }
}
