package org.pi.headfirstdesignpatterns.create.abstractfactory.sollution;

public class PizzaFranchise {
    public static void main(String[] args) {
        NyPizzaStore nyPizzaStore = new NyPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Eating :) " + nyCheesePizza.getName());
    }
}
