package org.pi.headfirstdesignpatterns.structure.decorator.problem.beverageswithcondiments;

import org.pi.headfirstdesignpatterns.structure.decorator.problem.Beverage;

public class HouseBlendWithSteamedMilkAndMocha implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend with Steamed Milk and Mocha";
    }

    @Override
    public double cost() {
        return 2.2;
    }
}
