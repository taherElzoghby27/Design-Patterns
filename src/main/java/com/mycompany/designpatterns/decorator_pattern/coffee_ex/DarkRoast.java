package com.mycompany.designpatterns.decorator_pattern.coffee_ex;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.describtion = "Dark Roast";
    }

    @Override
    public double cost() {
        return 30.0;
    }

}
