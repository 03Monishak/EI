package com.example.ecommerce;

public class ConfigurationManager {

    // Step 1: Create a private static instance of the class (Singleton instance)
    private static ConfigurationManager instance;

    // Step 2: Configuration properties
    private String languagePreference;

    // Step 3: Make the constructor private to prevent instantiation from outside
    private ConfigurationManager() {
        // Default language configuration
        languagePreference = "English";
    }

    // Step 4: Provide a public method to get the Singleton instance
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Method to set language preference
    public void setLanguagePreference(String language) {
        if (language.equalsIgnoreCase("English") || 
            language.equalsIgnoreCase("Spanish") || 
            language.equalsIgnoreCase("French")) {
            this.languagePreference = language;
        } else {
            throw new IllegalArgumentException("Unsupported language");
        }
    }

    // Method to get language preference
    public String getLanguagePreference() {
        return languagePreference;
    }

    @Override
    public String toString() {
        return "Current Language Preference: " + languagePreference;
    }
}