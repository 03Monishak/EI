package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsAggregator1 aggregator = new NewsAggregator1();
        
        aggregator.addArticle(new NewsArticle("Breaking News", "Content of breaking news", "Politics", 90));
        aggregator.addArticle(new NewsArticle("Tech Innovations", "Content about tech", "Technology", 80));
        aggregator.addArticle(new NewsArticle("Health Tips", "Content about health", "Health", 70));
        
        // Filter by topic
        aggregator.setFilterStrategy(new TopicFilterStrategy("Technology"));
        List<NewsArticle> techArticles = aggregator.getFilteredArticles();
        System.out.println("Filtered by topic 'Technology': " + techArticles);

        // Filter by popularity
        aggregator.setFilterStrategy(new PopularityFilterStrategy(75));
        List<NewsArticle> popularArticles = aggregator.getFilteredArticles();
        System.out.println("Filtered by popularity >= 75: " + popularArticles);

        // Filter by user preferences
        aggregator.setFilterStrategy(new UserPreferenceFilterStrategy(new HashSet<>(Arrays.asList("Health", "Politics"))));
        List<NewsArticle> preferredArticles = aggregator.getFilteredArticles();
        System.out.println("Filtered by user preferences (Health, Politics): " + preferredArticles);
    }
}