package com.mycompany.designpatterns.strategy_pattern.solution2.concreteStrategy;

import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.QuackableBehavior;

public class MuteQuack implements QuackableBehavior {

    @Override
    public void quack() {
        System.out.println("MuteQuack");
    }

}
