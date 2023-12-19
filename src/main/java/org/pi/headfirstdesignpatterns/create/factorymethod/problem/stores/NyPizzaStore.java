package org.pi.headfirstdesignpatterns.create.factorymethod.problem.stores;

import org.pi.headfirstdesignpatterns.create.factorymethod.problem.factories.NYPizzaFactory;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas.Pizza;

public class NyPizzaStore implements PizzaStore {
    private final NYPizzaFactory pizzaFactory;

    public NyPizzaStore(NYPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type); // now the factory creates pizza for us

        pizza.prepare();
        pizza.bake();
//        pizza.cut(); this store is not cutting pizzas
        pizza.box();

        return pizza;
    }
}
