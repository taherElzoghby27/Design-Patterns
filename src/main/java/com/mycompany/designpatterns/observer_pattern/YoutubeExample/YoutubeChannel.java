package com.mycompany.designpatterns.observer_pattern.YoutubeExample;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements ChannelSubject, ObserverDisplay {

    private List<UserObserver> users;
    private Video video;
    private String channelName;

    public YoutubeChannel(String channelName) {
        this.users = new ArrayList();
        this.channelName = channelName;
        display();
    }

    @Override
    public void subscribe(UserObserver user) {
        users.add(user);
    }

    @Override
    public void unSubscribe(UserObserver user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers() {
        for (UserObserver user : users) {
            user.update();
        }
    }

    public void setVideo(Video video) {
        this.video = video;
        notifyUsers();
    }

    public Video getVideo() {
        return this.video;
    }

    @Override
    public void display() {
        System.out.println("--\t\tchannel name : " + this.channelName);
    }

}
