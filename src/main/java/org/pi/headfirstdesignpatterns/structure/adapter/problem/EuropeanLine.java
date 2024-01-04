package org.pi.headfirstdesignpatterns.structure.adapter.problem;

public class EuropeanLine {
    private final int volts;

    public EuropeanLine(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }
}
