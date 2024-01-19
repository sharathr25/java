package org.pi.headfirstdesignpatterns.create.composite.problem;

public class Hotel {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PanCakeHouseMenu(), new DinerMenu());

        waitress.menu();
    }
}

