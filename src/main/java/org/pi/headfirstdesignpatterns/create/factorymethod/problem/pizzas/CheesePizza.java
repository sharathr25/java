package org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas;

import java.util.List;

public class CheesePizza extends Pizza {
    public CheesePizza(String place, String dough, String sauce, List<String> toppings) {
        super(place + " Cheese", dough, sauce, toppings);
    }
}
