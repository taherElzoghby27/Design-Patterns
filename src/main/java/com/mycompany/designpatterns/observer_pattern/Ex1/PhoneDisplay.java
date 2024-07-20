package com.mycompany.designpatterns.observer_pattern.Ex1;

public class PhoneDisplay implements Observer {

    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }

}
