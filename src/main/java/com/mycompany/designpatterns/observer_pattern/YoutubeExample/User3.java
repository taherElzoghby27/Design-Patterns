package com.mycompany.designpatterns.observer_pattern.YoutubeExample;

public class User3 implements UserObserver, ObserverDisplay {

    private Video video;
    private YoutubeChannel youtubeChannel;

    public User3(YoutubeChannel youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.subscribe(this);
    }

    @Override
    public void update() {
        this.video = this.youtubeChannel.getVideo();
        display();
    }

    @Override
    public void display() {
        System.out.println("User 3 : " + video);
    }

}
