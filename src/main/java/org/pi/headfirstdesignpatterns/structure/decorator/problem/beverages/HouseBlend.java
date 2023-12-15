package org.pi.headfirstdesignpatterns.structure.decorator.problem.beverages;

import org.pi.headfirstdesignpatterns.structure.decorator.problem.Beverage;

public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 0.80;
    }
}
