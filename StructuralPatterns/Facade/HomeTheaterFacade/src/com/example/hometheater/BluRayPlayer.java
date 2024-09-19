package com.example.hometheater;

// Blu-ray player subsystem
public class BluRayPlayer {
    public void on() {
        System.out.println("Blu-ray player is ON");
    }

    public void off() {
        System.out.println("Blu-ray player is OFF");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}