package org.pi.headfirstdesignpatterns.create.factorymethod.problem.stores;

import org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas.Pizza;

public interface PizzaStore {
    Pizza orderPizza(String type);
}
