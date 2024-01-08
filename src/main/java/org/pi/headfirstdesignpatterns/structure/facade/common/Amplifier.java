package org.pi.headfirstdesignpatterns.structure.facade.common;

public class Amplifier {

    public void on() {
        System.out.println("Amplifier On");
    }

    public void setInput(Dvd dvd) {
        System.out.println("Amplifier On");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier On");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier Volume: " + volume);
    }

    public void off() {
        System.out.println("Amplifier Off");
    }
}
