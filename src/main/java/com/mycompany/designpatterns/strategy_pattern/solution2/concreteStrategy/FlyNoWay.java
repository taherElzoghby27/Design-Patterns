package com.mycompany.designpatterns.strategy_pattern.solution2.concreteStrategy;

import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.Flyablebehavior;

public class FlyNoWay implements Flyablebehavior {

    @Override
    public void fly() {
        System.out.println("fly no way");
    }

}
