package org.pi.headfirstdesignpatterns.structure.adapter.problem;

public class Main {
    public static void main(String[] args) {
        EuropeanWallSocket europeanWallSocket = new EuropeanWallSocket();
        StandardACPlug standardACPlug = new StandardACPlug();

//        Below not possible
//        europeanWallSocket.plug(standardACPlug);
//        standardACPlug -X-> europeanWallSocket
    }
}
