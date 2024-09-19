package com.example.hometheater;

// TV subsystem
public class TV {
    public void on() {
        System.out.println("TV is ON");
    }

    public void off() {
        System.out.println("TV is OFF");
    }

    public void setInputChannel(String channel) {
        System.out.println("TV is set to channel: " + channel);
    }
}