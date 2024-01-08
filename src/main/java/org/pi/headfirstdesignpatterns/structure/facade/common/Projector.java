package org.pi.headfirstdesignpatterns.structure.facade.common;

public class Projector {
    public void on() {
        System.out.println("Projector On");
    }
    public void setInput(Dvd dvd) {
        System.out.println("Set Dvd in this Projector");
    }
    public void wideScreenMode() {
        System.out.println("Wide screen mode");
    }

    public void off() {
        System.out.println("Projector Off");
    }
}
