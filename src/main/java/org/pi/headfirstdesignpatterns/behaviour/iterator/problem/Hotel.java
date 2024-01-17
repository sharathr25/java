package org.pi.headfirstdesignpatterns.behaviour.iterator.problem;

public class Hotel {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PanCakeHouseMenu(), new DinerMenu());

        waitress.menu();
    }
}

