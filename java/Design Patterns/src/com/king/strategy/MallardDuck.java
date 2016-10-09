package com.king.strategy;

import com.king.strategy.behavior.FlyWithWings;
import com.king.strategy.behavior.Quack;

/**
 * @author  king
 */
public class MallardDuck  extends  Duck{

    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("我能游泳");
    }

    @Override
    public void display() {
        System.out.println("我是一个mallardDuck");
    }
}
