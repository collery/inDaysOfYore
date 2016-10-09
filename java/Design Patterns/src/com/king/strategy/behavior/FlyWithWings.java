package com.king.strategy.behavior;

import com.king.strategy.behavior.FlyBehavior;

/**
 * @author  king
 * 用翅膀飞
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我用翅膀飞");
    }
}
