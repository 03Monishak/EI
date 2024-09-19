package com.example;

import java.util.List;

public interface FilterStrategy {
    List<NewsArticle> filter(List<NewsArticle> articles);
}
