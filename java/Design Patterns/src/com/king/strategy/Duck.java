package com.king.strategy;

import com.king.strategy.behavior.FlyBehavior;
import com.king.strategy.behavior.QuackBehavior;

/**
 * 鸭子
 */
public abstract class Duck {

    public QuackBehavior quackBehavior;

    public FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public abstract void swim();

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior =flyBehavior;
    }

}
