package com.mycompany.designpatterns.observer_pattern.YoutubeExample;

public class Video {

    private final String name;
    private final String link;
    private final String time;
    private final String primaryPhoto;

    public Video(String name, String link, String time, String primaryPhoto) {
        this.name = name;
        this.link = link;
        this.time = time;
        this.primaryPhoto = primaryPhoto;
    }

    @Override
    public String toString() {
        return "Video {" + "name=" + name + ", link=" + link + ", time=" + time + ", primaryPhoto=" + primaryPhoto + '}';
    }

}
