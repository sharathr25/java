package org.pi.headfirstdesignpatterns.create.abstractfactory.sollution;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientsFactory pizzaIngredientsFactory = new NYPizzaIngredientsFactory();
        return switch (type) {
            case "cheese" -> new CheesePizza(pizzaIngredientsFactory);
            default -> throw new IllegalArgumentException("Unknown pizza type");
        };
    }
}
