package com.mycompany.designpatterns.observer_pattern.Ex1;

import java.util.ArrayList;
import java.util.List;

public class WorkStation implements Subject {

    private List<Observer> observers;
    private String weather;

    public WorkStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}
