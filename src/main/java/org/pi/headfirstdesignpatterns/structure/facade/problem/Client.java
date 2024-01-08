package org.pi.headfirstdesignpatterns.structure.facade.problem;

import org.pi.headfirstdesignpatterns.structure.facade.common.*;

public class Client {
    public static void main(String[] args) {
        Popper popper = new Popper();
        Lights lights = new Lights();
        Screen screen = new Screen();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        Dvd dvd = new Dvd();

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
        dvd.play("terminator");
    }
}
