package com.example.ecommerce;

public class Main {

    public static void main(String[] args) {
        // Access the Singleton instance of ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Display default language setting
        System.out.println("Default configuration: " + configManager);

        // Simulate language change by the user
        configManager.setLanguagePreference("Spanish");
        System.out.println("Updated configuration: " + configManager);

        // Verify that all accesses to the ConfigurationManager reflect the change
        ConfigurationManager anotherManagerInstance = ConfigurationManager.getInstance();
        System.out.println("Second access to configuration: " + anotherManagerInstance);
        
        // Attempt to set an unsupported language
        try {
            configManager.setLanguagePreference("German");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Check that configuration remains unchanged after the error
        System.out.println("Final configuration: " + configManager);
    }
}