package org.pi.headfirstdesignpatterns.behaviour.iterator.problem;

import org.pi.headfirstdesignpatterns.behaviour.iterator.common.MenuItem;

import java.util.List;

public class Waitress {
    private final PanCakeHouseMenu panCakeHouseMenu;
    private final DinerMenu dinerMenu;


    public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinerMenu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void menu() {
        List<MenuItem> panCakeHouseMenuMenuItems = panCakeHouseMenu.getMenuItems();
        System.out.println("Pan Cake Menu");
        System.out.println("=============");
        for (int i = 0; i < panCakeHouseMenuMenuItems.size(); i++) {
            printMenu(panCakeHouseMenuMenuItems.get(i));
        }

        System.out.println();

        System.out.println("Diner Menu");
        System.out.println("==========");
        MenuItem[] dinerMenuMenuItems = dinerMenu.getMenuItems();
        for (int i = 0; i < dinerMenuMenuItems.length; i++) {
            MenuItem dinerMenuMenuItem = dinerMenuMenuItems[i];
            if(dinerMenuMenuItem != null) {
                printMenu(dinerMenuMenuItem);
            }
        }
    }

    private void printMenu(MenuItem menuItem) {
        System.out.println(menuItem.getName()
                + (menuItem.isVegetarian() ? " \uD83D\uDFE2           " : "")
                + menuItem.getPrice());
        System.out.println(menuItem.getDescription());
        System.out.println();
    }
}
