package org.pi.headfirstdesignpatterns.structure.adapter.sollution;

public class EuropeanWallSocket {
    private EuropeanEarth earth;
    private EuropeanLine line;
    private EuropeanNeutral neutral;

    void plug(EuropeanACPlug europeanACPlug) {
        this.earth = europeanACPlug.getEarth();
        this.line = europeanACPlug.getLine();
        this.neutral = europeanACPlug.getNeutral();
    }
}
