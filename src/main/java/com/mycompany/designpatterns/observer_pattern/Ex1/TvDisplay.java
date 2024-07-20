package com.mycompany.designpatterns.observer_pattern.Ex1;

public class TvDisplay implements Observer {

    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("Tv Display: Weather updated - " + weather);
    }
}
