package org.pi.headfirstdesignpatterns.structure.decorator.sollution.condiments;

import org.pi.headfirstdesignpatterns.structure.decorator.sollution.Beverage;
import org.pi.headfirstdesignpatterns.structure.decorator.sollution.CondimentDecorator;

public class Whip implements CondimentDecorator {
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
