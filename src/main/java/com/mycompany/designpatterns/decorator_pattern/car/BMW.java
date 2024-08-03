package com.mycompany.designpatterns.decorator_pattern.car;

public class BMW extends CarModel {

    @Override
    public String desc() {
        return "BMW , Black , 2024 ";
    }

    @Override
    public int cost() {
        return 2150900;
    }

}
