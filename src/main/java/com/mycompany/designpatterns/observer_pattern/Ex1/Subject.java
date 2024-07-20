package com.mycompany.designpatterns.observer_pattern.Ex1;

public interface Subject {

    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers();
}
