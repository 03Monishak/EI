package com.example.hometheater;

// Speakers subsystem
public class Speakers {
    public void on() {
        System.out.println("Speakers are ON");
    }

    public void off() {
        System.out.println("Speakers are OFF");
    }

    public void setVolume(int level) {
        System.out.println("Speakers volume set to: " + level);
    }
}