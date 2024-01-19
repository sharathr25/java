package org.pi.headfirstdesignpatterns.create.composite.sollution;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println(name + (isVegetarian() ? " \uD83D\uDFE2           " : "") + price);
        System.out.println(description);
        System.out.println();
    }
}