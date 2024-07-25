package com.mycompany.designpatterns.decorator_pattern.coffee_ex;

public abstract class Beverage {

    protected String describtion;

    public String getDescribtion() {
        return describtion;
    }

    public abstract double cost();
}
