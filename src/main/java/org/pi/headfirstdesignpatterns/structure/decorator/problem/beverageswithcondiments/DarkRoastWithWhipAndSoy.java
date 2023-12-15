package org.pi.headfirstdesignpatterns.structure.decorator.problem.beverageswithcondiments;

import org.pi.headfirstdesignpatterns.structure.decorator.problem.Beverage;

public class DarkRoastWithWhipAndSoy implements Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast with Whip and Soy";
    }

    @Override
    public double cost() {
        return 3.1;
    }
}
