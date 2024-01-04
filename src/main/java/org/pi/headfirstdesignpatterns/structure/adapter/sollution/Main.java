package org.pi.headfirstdesignpatterns.structure.adapter.sollution;

public class Main {
    public static void main(String[] args) {
        EuropeanWallSocket europeanWallSocket = new EuropeanWallSocket();
        StandardACPlug standardACPlug = new StandardACPlug();
        ACPowerAdapter acPowerAdapter = new ACPowerAdapter();

        acPowerAdapter.plug(standardACPlug);

        europeanWallSocket.plug(acPowerAdapter.getEuropeanACPlug());

//        standardACPlug -> acPowerAdapter -> europeanWallSocket
    }
}
