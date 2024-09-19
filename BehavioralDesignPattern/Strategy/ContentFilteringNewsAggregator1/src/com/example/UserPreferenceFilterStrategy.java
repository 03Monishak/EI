package com.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserPreferenceFilterStrategy implements FilterStrategy {
    private Set<String> preferredTopics;

    public UserPreferenceFilterStrategy(Set<String> preferredTopics) {
        this.preferredTopics = preferredTopics;
    }

    @Override
    public List<NewsArticle> filter(List<NewsArticle> articles) {
        return articles.stream()
            .filter(article -> preferredTopics.contains(article.getTopic()))
            .collect(Collectors.toList());
    }
}