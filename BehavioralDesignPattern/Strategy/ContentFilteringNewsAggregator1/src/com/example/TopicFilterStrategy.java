package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class TopicFilterStrategy implements FilterStrategy {
    private String topic;

    public TopicFilterStrategy(String topic) {
        this.topic = topic;
    }

    @Override
    public List<NewsArticle> filter(List<NewsArticle> articles) {
        return articles.stream()
            .filter(article -> article.getTopic().equalsIgnoreCase(topic))
            .collect(Collectors.toList());
    }
}