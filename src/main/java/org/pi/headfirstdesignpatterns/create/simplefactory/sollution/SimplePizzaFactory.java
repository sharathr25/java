package org.pi.headfirstdesignpatterns.create.simplefactory.sollution;

public class SimplePizzaFactory {
    Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "greek" -> new GreekPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Unknown pizza type");
        };
    }
}
