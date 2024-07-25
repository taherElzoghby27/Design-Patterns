package com.mycompany.designpatterns.decorator_pattern.coffee_ex;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescribtion() {
        return this.beverage.getDescribtion() + " , Mocha ";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 12.0;
    }

}
