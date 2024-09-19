package com.example.hometheater;

// Facade class to control the home theater system
public class HomeTheaterFacade {
    private TV tv;
    private Speakers speakers;
    private BluRayPlayer bluRayPlayer;
    private Lights lights;

    public HomeTheaterFacade(TV tv, Speakers speakers, BluRayPlayer bluRayPlayer, Lights lights) {
        this.tv = tv;
        this.speakers = speakers;
        this.bluRayPlayer = bluRayPlayer;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        tv.on();
        tv.setInputChannel("HDMI1");
        speakers.on();
        speakers.setVolume(10);
        bluRayPlayer.on();
        bluRayPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        lights.dim(100);
        bluRayPlayer.off();
        speakers.off();
        tv.off();
    }
}