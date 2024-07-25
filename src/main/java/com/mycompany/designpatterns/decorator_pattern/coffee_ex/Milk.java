package com.mycompany.designpatterns.decorator_pattern.coffee_ex;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescribtion() {
        return this.beverage.getDescribtion() + " , Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 6.0;
    }

}
