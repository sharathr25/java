package org.pi.headfirstdesignpatterns.structure.facade.sollution;

import org.pi.headfirstdesignpatterns.structure.facade.common.*;

public class HomeTheatreFacade {
    private final Popper popper = new Popper();
    private final Lights lights = new Lights();
    private final Screen screen = new Screen();
    private final Projector projector = new Projector();
    private final Amplifier amplifier = new Amplifier();
    private final Dvd dvd = new Dvd();

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch movie:::::");
        // Turn on the popcorn popper and start popping...
        popper.on();
        popper.pop();

        // Dim the lights to 10%...
        lights.dim(10);

        // Put the screen down...
        screen.down();

        // Turn on the projector and put it in wide screen mode for the movie...
        projector.on();
        projector.setInput(dvd);
        projector.wideScreenMode();

        // Turn on the amp, set it to DVD, put it in surround sound mode and set the volume to 5...
        amplifier.on();
        amplifier.setInput(dvd);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down home theatre::::::");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.off();
    }
}
