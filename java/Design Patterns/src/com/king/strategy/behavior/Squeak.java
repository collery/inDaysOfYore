package com.king.strategy.behavior;

/**
 * @author  king
 * for 橡皮鸭
 */
public class Squeak implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭吱吱叫");
    }
}
