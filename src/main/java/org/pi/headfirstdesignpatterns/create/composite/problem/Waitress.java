package org.pi.headfirstdesignpatterns.create.composite.problem;

import java.util.Iterator;

public class Waitress {
    private final PanCakeHouseMenu panCakeHouseMenu;
    private final DinerMenu dinerMenu;


    public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinerMenu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void menu() {
        System.out.println("Pan Cake Menu");
        System.out.println("=============");
        printMenu(panCakeHouseMenu.createIterator());

        System.out.println();

        System.out.println("Diner Menu");
        System.out.println("==========");
        printMenu(dinerMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> menuIterator) {
        while (menuIterator.hasNext()) {
            MenuItem menuItem = menuIterator.next();
            System.out.println(menuItem.getName()
                    + (menuItem.isVegetarian() ? " \uD83D\uDFE2           " : "")
                    + menuItem.getPrice());
            System.out.println(menuItem.getDescription());
            System.out.println();
        }
    }
}
