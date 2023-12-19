package org.pi.headfirstdesignpatterns.create.simplefactory.problem;

public class PizzaStore {
    Pizza orderPizza() { // this is fine for just pizza, but we will have different pizzas
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    Pizza orderPizza(String type) {
        // now we can create different pizzas, but this not closed for modification
        // whenever we need to create new type of pizza we need to extend this switch
        // and except creating pizza everything stays same like prepare, bake, cut and box
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "greek" -> new GreekPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Unknown pizza type");
        };

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
