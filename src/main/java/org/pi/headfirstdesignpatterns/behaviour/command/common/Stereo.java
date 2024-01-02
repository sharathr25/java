package org.pi.headfirstdesignpatterns.behaviour.command.common;

public class Stereo {
    public void on() {
        System.out.println("Stereo On");
    }

    public void off() {
        System.out.println("Stereo Off");
    }

    public void setCd() {
        System.out.println("Set CD");
    }

    public void setDvd() {
        System.out.println("Set DVD");
    }

    public void setRadio() {
        System.out.println("Set Radio");
    }

    public void setVolume(int volume) {
        System.out.println("Volume " + volume);
    }
}
