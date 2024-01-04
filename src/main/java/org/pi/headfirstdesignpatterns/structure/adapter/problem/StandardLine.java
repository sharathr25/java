package org.pi.headfirstdesignpatterns.structure.adapter.problem;

public class StandardLine {
    private final int volts;

    public StandardLine(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }
}
