package com.mycompany.designpatterns.strategy_pattern.solution2.client;

import com.mycompany.designpatterns.strategy_pattern.solution2.context.Duck;
import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.Flyablebehavior;
import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.QuackableBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(Flyablebehavior flyablebehavior, QuackableBehavior quackableBehavior) {
        super(flyablebehavior, quackableBehavior);
        System.out.println("MallardDuck");
    }

}
