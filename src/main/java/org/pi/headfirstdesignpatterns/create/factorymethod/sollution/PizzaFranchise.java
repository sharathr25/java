package org.pi.headfirstdesignpatterns.create.factorymethod.sollution;

import org.pi.headfirstdesignpatterns.create.factorymethod.sollution.pizzas.Pizza;
import org.pi.headfirstdesignpatterns.create.factorymethod.sollution.stores.ChicagoPizzaStore;
import org.pi.headfirstdesignpatterns.create.factorymethod.sollution.stores.NyPizzaStore;

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
