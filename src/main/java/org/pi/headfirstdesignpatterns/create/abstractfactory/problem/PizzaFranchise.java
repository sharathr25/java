package org.pi.headfirstdesignpatterns.create.abstractfactory.problem;

import org.pi.headfirstdesignpatterns.create.abstractfactory.problem.pizzas.Pizza;
import org.pi.headfirstdesignpatterns.create.abstractfactory.problem.stores.ChicagoPizzaStore;
import org.pi.headfirstdesignpatterns.create.abstractfactory.problem.stores.NyPizzaStore;

public class PizzaFranchise {
    public static void main(String[] args) {
        NyPizzaStore nyPizzaStore = new NyPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Eating :) " + nyCheesePizza.getName());

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Eating :) " + chicagoCheesePizza.getName());
    }
}
