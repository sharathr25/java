package org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas;

import java.util.List;

public class GreekPizza extends Pizza {
    public GreekPizza(String place, String dough, String sauce, List<String> toppings) {
        super(place + " Greek", dough, sauce, toppings);
    }
}
