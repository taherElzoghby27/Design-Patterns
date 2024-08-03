package com.mycompany.designpatterns.decorator_pattern.car;
public class SunRoof extends CarDecorator{

    public SunRoof(CarModel carModel) {
        this.carModel=carModel;
    }

    @Override
    public int cost() {
        return this.carModel.cost()+15000;
    }

    @Override
    public String desc() {
        return this.carModel.desc()+" , sunroof ";
    }
    
}
