package org.pi.headfirstdesignpatterns.behaviour.command.common;

public class Hottub {
    public void circulate() {
        System.out.println("Circulate");
    }

    public void jetsOn() {
        System.out.println("Jet On");
    }

    public void jetsOff() {
        System.out.println("Jet Off");
    }

    public void setTemperature(int temperature) {
        System.out.println("Temperature " + temperature);
    }
}
