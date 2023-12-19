package org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas;

import java.util.List;

public class Pizza {
    private final String name;
    private final String dough;
    private final String sauce;
    private final List<String> toppings;

    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings: ");
        toppings.forEach(System.out::println);
        System.out.println("Prepared " + name);
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
