package com.mycompany.designpatterns.observer_pattern.news_agency_examble;

public interface Subject {

    public void addChannel(Channel channel);

    public void deleteChannel(Channel channel);

    public void notifyChannels();
}
