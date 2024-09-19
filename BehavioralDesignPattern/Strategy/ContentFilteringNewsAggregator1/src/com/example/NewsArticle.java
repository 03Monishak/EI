package com.example;

public class NewsArticle {
    private String title;
    private String content;
    private String topic;
    private int popularity;

    public NewsArticle(String title, String content, String topic, int popularity) {
        this.title = title;
        this.content = content;
        this.topic = topic;
        this.popularity = popularity;
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getTopic() { return topic; }
    public int getPopularity() { return popularity; }

    @Override
    public String toString() {
        return title + " (" + topic + ", Popularity: " + popularity + ")";
    }
}