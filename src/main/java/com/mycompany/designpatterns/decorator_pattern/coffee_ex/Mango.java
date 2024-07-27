package com.mycompany.designpatterns.decorator_pattern.coffee_ex;

public class Mango extends Beverage {

    public Mango() {
        this.describtion = "Mango ";
    }

    @Override
    public double cost() {
        return 47;
    }

}
