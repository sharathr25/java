package org.pi.headfirstdesignpatterns.create.factorymethod.problem.stores;

import org.pi.headfirstdesignpatterns.create.factorymethod.problem.factories.ChicagoPizzaFactory;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas.Pizza;

public class ChicagoPizzaStore implements PizzaStore {
    private final ChicagoPizzaFactory pizzaFactory;

    public ChicagoPizzaStore(ChicagoPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type); // now the factory creates pizza for us

        pizza.prepare();
        pizza.bake();
        pizza.cut();
//        pizza.box(); this store is using some third party boxes

        return pizza;
    }
}
