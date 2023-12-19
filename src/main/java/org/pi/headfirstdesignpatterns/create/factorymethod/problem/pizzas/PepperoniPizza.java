package org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas;

import java.util.List;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(String place, String dough, String sauce, List<String> toppings) {
        super(place + "Pepperoni", dough, sauce, toppings);
    }
}
