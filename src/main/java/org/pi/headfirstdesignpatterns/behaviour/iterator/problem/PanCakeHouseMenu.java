package org.pi.headfirstdesignpatterns.behaviour.iterator.problem;

import org.pi.headfirstdesignpatterns.behaviour.iterator.common.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class PanCakeHouseMenu {
    private List<MenuItem> menuItems;

    public PanCakeHouseMenu() {
        menuItems = new ArrayList<>();

        addMenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addMenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addMenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addMenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
