package com.mycompany.designpatterns.observer_pattern.YoutubeExample;

public class User2 implements UserObserver, ObserverDisplay {

    private Video video;
    private YoutubeChannel youtubeChannel;

    public User2(YoutubeChannel youtubeChannel) {
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
        System.out.println("User 2 : " + video);
    }
}
