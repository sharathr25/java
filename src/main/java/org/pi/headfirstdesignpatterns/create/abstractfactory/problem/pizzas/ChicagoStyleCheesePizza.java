package org.pi.headfirstdesignpatterns.create.abstractfactory.problem.pizzas;

public class ChicagoStyleCheesePizza extends Pizza {
    ChicagoStyleCheesePizza() {
        name = "Chicago style pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into squares");
    }
}
