package com.example;

import java.util.ArrayList;
import java.util.List;

public class NewsAggregator1 {
    private List<NewsArticle> articles;
    private FilterStrategy filterStrategy;

    public NewsAggregator1() {
        this.articles = new ArrayList<>();
    }

    public void addArticle(NewsArticle article) {
        articles.add(article);
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public List<NewsArticle> getFilteredArticles() {
        if (filterStrategy == null) {
            return articles;
        }
        return filterStrategy.filter(articles);
    }
}
