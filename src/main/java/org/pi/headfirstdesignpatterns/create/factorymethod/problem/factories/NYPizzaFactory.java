package org.pi.headfirstdesignpatterns.create.factorymethod.problem.factories;

import org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas.CheesePizza;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas.GreekPizza;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas.PepperoniPizza;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas.Pizza;

import java.util.List;

public class NYPizzaFactory {
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza("NY","wheat", "cheese", List.of("onions", "tomatoes"));
            case "greek" -> new GreekPizza("NY","wheat", "cream", List.of("onions", "tomatoes"));
            case "pepperoni" -> new PepperoniPizza("NY","wheat", "tomato", List.of("onions", "tomatoes"));
            default -> throw new IllegalArgumentException("Unknown pizza type");
        };
    }
}
