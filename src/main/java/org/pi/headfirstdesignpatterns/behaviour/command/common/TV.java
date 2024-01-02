package org.pi.headfirstdesignpatterns.behaviour.command.common;

public class TV {
    public void on() {
        System.out.println("TV On");
    }

    public void off() {
        System.out.println("TV Off");
    }

    public void setInputChannel(int channel) {
        System.out.println("Channel " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("Volume " + volume);
    }
}
