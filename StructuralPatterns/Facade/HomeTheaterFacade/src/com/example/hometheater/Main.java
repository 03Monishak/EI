package com.example.hometheater;

public class Main {

    public static void main(String[] args) {
        // Create subsystems
        TV tv = new TV();
        Speakers speakers = new Speakers();
        BluRayPlayer bluRayPlayer = new BluRayPlayer();
        Lights lights = new Lights();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, speakers, bluRayPlayer, lights);

        // Watch a movie
        homeTheater.watchMovie("Inception");

        // End the movie
        homeTheater.endMovie();
    }
}