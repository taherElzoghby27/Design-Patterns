package com.mycompany.designpatterns.strategy_pattern.solution2.concreteStrategy;

import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.Flyablebehavior;

public class flyWithWings implements Flyablebehavior {

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }

}
