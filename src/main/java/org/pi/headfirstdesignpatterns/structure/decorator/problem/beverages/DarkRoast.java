package org.pi.headfirstdesignpatterns.structure.decorator.problem.beverages;

import org.pi.headfirstdesignpatterns.structure.decorator.problem.Beverage;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.12;
    }
}
