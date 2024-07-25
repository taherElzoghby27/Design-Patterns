package com.mycompany.designpatterns.decorator_pattern.coffee_ex;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescribtion();

}
