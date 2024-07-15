package com.mycompany.designpatterns.strategy_pattern.solution2.context;

import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.Flyablebehavior;
import com.mycompany.designpatterns.strategy_pattern.solution2.strategyInterface.QuackableBehavior;

public class Duck {

    private Flyablebehavior flyablebehavior;
    private QuackableBehavior quackableBehavior;

    public Duck(Flyablebehavior flyablebehavior, QuackableBehavior quackableBehavior) {
        this.flyablebehavior = flyablebehavior;
        this.quackableBehavior = quackableBehavior;
    }

    public void setFlyablebehavior(Flyablebehavior flyablebehavior) {
        this.flyablebehavior = flyablebehavior;
    }

    public void setQuackableBehavior(QuackableBehavior quackableBehavior) {
        this.quackableBehavior = quackableBehavior;
    }

    public void performQuack() {
        quackableBehavior.quack();
    }

    public void getFlyablebehavior() {
        flyablebehavior.fly();
    }

    public void swim() {
        System.out.println("swim");
    }

    public void display() {
        System.out.println("display");
    }

}
