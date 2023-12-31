package org.pi.headfirstdesignpatterns.create.abstractfactory.sollution;

import org.pi.headfirstdesignpatterns.create.abstractfactory.sollution.ingredients.*;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{ new Garlic(), new Onion(), new Mushroom() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
