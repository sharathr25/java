package org.pi.headfirstdesignpatterns.create.abstractfactory.sollution;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type); // this is the factory method. the star of the show
}
