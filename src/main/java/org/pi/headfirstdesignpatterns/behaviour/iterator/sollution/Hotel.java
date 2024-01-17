package org.pi.headfirstdesignpatterns.behaviour.iterator.sollution;

public class Hotel {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PanCakeHouseMenu(), new DinerMenu());

        waitress.menu();
    }
}

