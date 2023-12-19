package org.pi.headfirstdesignpatterns.create.simplefactory.sollution;

public class PizzaStore {
    private final SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type); // now the factory creates pizza for us

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
