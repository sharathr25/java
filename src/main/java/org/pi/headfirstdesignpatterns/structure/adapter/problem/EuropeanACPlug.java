package org.pi.headfirstdesignpatterns.structure.adapter.problem;

public class EuropeanACPlug {
    private final EuropeanLine line;
    private final EuropeanNeutral neutral;
    private final EuropeanEarth earth;

    public EuropeanACPlug(EuropeanLine line, EuropeanNeutral neutral, EuropeanEarth earth) {
        this.line = line;
        this.neutral = neutral;
        this.earth = earth;
    }

    public EuropeanEarth getEarth() {
        return earth;
    }

    public EuropeanLine getLine() {
        return line;
    }

    public EuropeanNeutral getNeutral() {
        return neutral;
    }
}

