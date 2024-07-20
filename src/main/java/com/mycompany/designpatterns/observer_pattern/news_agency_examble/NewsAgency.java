package com.mycompany.designpatterns.observer_pattern.news_agency_examble;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private List<Channel> channels;
    private String news;

    public NewsAgency() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void deleteChannel(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public void notifyChannels() {
        for (Channel channel : channels) {
            channel.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyChannels();
    }

}
