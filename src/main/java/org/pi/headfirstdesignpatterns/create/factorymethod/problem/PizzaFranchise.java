package org.pi.headfirstdesignpatterns.create.factorymethod.problem;

import org.pi.headfirstdesignpatterns.create.factorymethod.problem.factories.ChicagoPizzaFactory;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.factories.NYPizzaFactory;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.pizzas.Pizza;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.stores.ChicagoPizzaStore;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.stores.NyPizzaStore;
import org.pi.headfirstdesignpatterns.create.factorymethod.problem.stores.PizzaStore;

public class PizzaFranchise {
    public static void main(String[] args) {
        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        PizzaStore nyPizzaStore = new NyPizzaStore(nyPizzaFactory);
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Eating :) " + nyCheesePizza.getName());

        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore(chicagoPizzaFactory);
        Pizza chicagoCheedPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Eating :) " + chicagoCheedPizza.getName());
    }
}
