package com.mycompany.designpatterns.strategy_pattern.solution2.concreteStrategy;

import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.QuackableBehavior;

public class Quack implements QuackableBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }

}
