package org.pi.headfirstdesignpatterns.structure.facade.sollution;

public class Client {
    public static void main(String[] args) {
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade();
        homeTheatreFacade.watchMovie("terminator");
        homeTheatreFacade.endMovie();
    }
}
