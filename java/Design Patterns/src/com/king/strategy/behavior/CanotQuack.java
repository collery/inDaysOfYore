package com.king.strategy.behavior;

/**
 * @author  king
 * 哑巴不会叫
 */
public class CanotQuack implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}
