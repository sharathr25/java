package org.pi.headfirstdesignpatterns.structure.adapter.sollution;

public class ACPowerAdapter {
    private EuropeanACPlug europeanACPlug;

    void plug(StandardACPlug standardACPlug) {
        europeanACPlug = new EuropeanACPlug(
                new EuropeanLine(standardACPlug.getLine().getVolts()),
                new EuropeanNeutral(standardACPlug.getNeutral().getVolts()),
                new EuropeanEarth());
    }

    public EuropeanACPlug getEuropeanACPlug() {
        return europeanACPlug;
    }
}
