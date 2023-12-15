package org.pi.headfirstdesignpatterns.structure.decorator.sollution.beverages;

import org.pi.headfirstdesignpatterns.structure.decorator.sollution.Beverage;

public class Decaf implements Beverage {
    @Override
    public String description() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
