package com.mycompany.designpatterns.strategy_pattern.solution2.client;

import com.mycompany.designpatterns.strategy_pattern.solution2.context.Duck;
import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.Flyablebehavior;
import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.QuackableBehavior;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(Flyablebehavior flyablebehavior, QuackableBehavior quackableBehavior) {
        super(flyablebehavior, quackableBehavior);
        System.out.println("RedHeadDuck");
    }
}
