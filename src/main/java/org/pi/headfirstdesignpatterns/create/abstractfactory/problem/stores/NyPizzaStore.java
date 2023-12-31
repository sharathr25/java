package org.pi.headfirstdesignpatterns.create.abstractfactory.problem.stores;

import org.pi.headfirstdesignpatterns.create.abstractfactory.problem.pizzas.NyStyleCheesePizza;
import org.pi.headfirstdesignpatterns.create.abstractfactory.problem.pizzas.Pizza;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NyStyleCheesePizza();
            default -> throw new IllegalArgumentException("Unknown pizza type");
        };
    }
}
