package com.king.strategy.behavior;

/**
 * @author king
 * 呱呱叫
 */
public class Quack implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
