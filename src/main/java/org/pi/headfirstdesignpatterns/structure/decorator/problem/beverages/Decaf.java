package org.pi.headfirstdesignpatterns.structure.decorator.problem.beverages;

import org.pi.headfirstdesignpatterns.structure.decorator.problem.Beverage;

public class Decaf implements Beverage {
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
