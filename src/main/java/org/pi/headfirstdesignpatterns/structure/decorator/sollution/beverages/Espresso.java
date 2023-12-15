package org.pi.headfirstdesignpatterns.structure.decorator.sollution.beverages;

import org.pi.headfirstdesignpatterns.structure.decorator.sollution.Beverage;

public class Espresso implements Beverage {
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
