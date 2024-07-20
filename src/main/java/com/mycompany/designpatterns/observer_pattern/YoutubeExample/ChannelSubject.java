package com.mycompany.designpatterns.observer_pattern.YoutubeExample;

public interface ChannelSubject {

    public void subscribe(UserObserver observer);

    public void unSubscribe(UserObserver observer);

    public void notifyUsers();
}
