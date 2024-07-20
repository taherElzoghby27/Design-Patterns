package com.mycompany.designpatterns.observer_pattern.YoutubeExample;

public class User3 implements UserObserver, ObserverDisplay {

    private Video video;

    @Override
    public void update(Video video) {
        this.video = video;
        display();
    }

    @Override
    public void display() {
        System.out.println("User 3 : " + video);
    }

}
