package org.pi.headfirstdesignpatterns.create.abstractfactory.problem.pizzas;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Adding dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: ");
        toppings.forEach(System.out::println);
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
