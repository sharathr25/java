package org.pi.headfirstdesignpatterns.structure.decorator.sollution.beverages;

import org.pi.headfirstdesignpatterns.structure.decorator.sollution.Beverage;

public class DarkRoast implements Beverage {
    @Override
    public String description() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.12;
    }
}
