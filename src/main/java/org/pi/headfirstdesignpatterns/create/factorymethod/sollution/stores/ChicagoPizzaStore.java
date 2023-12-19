package org.pi.headfirstdesignpatterns.create.factorymethod.sollution.stores;

import org.pi.headfirstdesignpatterns.create.factorymethod.sollution.pizzas.NyStyleCheesePizza;
import org.pi.headfirstdesignpatterns.create.factorymethod.sollution.pizzas.Pizza;

import java.util.List;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NyStyleCheesePizza();
            default -> throw new IllegalArgumentException("Unknown pizza type");
        };
    }
}
