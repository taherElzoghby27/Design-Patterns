package com.mycompany.designpatterns.observer_pattern.news_agency_examble;

public class BBCChannel implements Channel {

    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        displays();
    }

    public void displays() {
        System.out.println("BBC Channel : " + this.news);
    }

}
