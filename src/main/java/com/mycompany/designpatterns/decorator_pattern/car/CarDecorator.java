package com.mycompany.designpatterns.decorator_pattern.car;

public abstract class CarDecorator extends CarModel {

    CarModel carModel;

    @Override
    public abstract int cost();

    @Override
    public abstract String desc();

}
