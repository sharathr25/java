package org.pi.headfirstdesignpatterns.create.abstractfactory.sollution;

import org.pi.headfirstdesignpatterns.create.abstractfactory.sollution.ingredients.*;

public interface PizzaIngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
