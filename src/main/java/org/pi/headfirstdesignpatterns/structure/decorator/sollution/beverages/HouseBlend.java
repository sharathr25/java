package org.pi.headfirstdesignpatterns.structure.decorator.sollution.beverages;

import org.pi.headfirstdesignpatterns.structure.decorator.sollution.Beverage;

public class HouseBlend implements Beverage {
    @Override
    public String description() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 0.80;
    }
}
