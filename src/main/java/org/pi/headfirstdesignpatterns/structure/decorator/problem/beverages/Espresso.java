package org.pi.headfirstdesignpatterns.structure.decorator.problem.beverages;

import org.pi.headfirstdesignpatterns.structure.decorator.problem.Beverage;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
