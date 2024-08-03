package com.mycompany.designpatterns.decorator_pattern.car;

public class NavigationSystem extends CarDecorator {

    public NavigationSystem(CarModel carModel) {
        this.carModel = carModel;
    }

    @Override
    public int cost() {
        return this.carModel.cost()+12000;
    }

    @Override
    public String desc() {
        return this.carModel.desc()+" , navigation system ";
    }

}
