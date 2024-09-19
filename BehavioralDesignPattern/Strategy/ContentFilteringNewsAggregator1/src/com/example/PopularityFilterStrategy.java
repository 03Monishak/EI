package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class PopularityFilterStrategy implements FilterStrategy {
    private int minPopularity;

    public PopularityFilterStrategy(int minPopularity) {
        this.minPopularity = minPopularity;
    }

    @Override
    public List<NewsArticle> filter(List<NewsArticle> articles) {
        return articles.stream()
            .filter(article -> article.getPopularity() >= minPopularity)
            .collect(Collectors.toList());
    }
}