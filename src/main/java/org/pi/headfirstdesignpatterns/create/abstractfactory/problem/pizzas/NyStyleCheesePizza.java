package org.pi.headfirstdesignpatterns.create.abstractfactory.problem.pizzas;

public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        name = "New York style pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
