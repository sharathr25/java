package org.pi.headfirstdesignpatterns.create.abstractfactory.sollution;

public class CheesePizza extends Pizza {
    private final PizzaIngredientsFactory pizzaIngredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
        this.name = "Cheese Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientsFactory.createDough();
        sauce = pizzaIngredientsFactory.createSauce();
        cheese = pizzaIngredientsFactory.createCheese();
    }
}
