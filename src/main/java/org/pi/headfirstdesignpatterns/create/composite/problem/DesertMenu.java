package org.pi.headfirstdesignpatterns.create.composite.problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DesertMenu {
    private final List<MenuItem> menuItems;

    public DesertMenu() {
        menuItems = new ArrayList<>();

        addMenuItem("Honey cake",
                "Honey cake",
                true,
                2.99);
        addMenuItem("Jamoon",
                "Jamoon",
                true,
                2.99);
        addMenuItem("Ice Cream ",
                "Ice Cream ",
                true,
                3.49);
        addMenuItem("Halwa",
                "Halwa",
                true,
                3.59);
    }

    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
