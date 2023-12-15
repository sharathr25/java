package org.pi.headfirstdesignpatterns.structure.decorator.sollution.condiments;

import org.pi.headfirstdesignpatterns.structure.decorator.sollution.Beverage;
import org.pi.headfirstdesignpatterns.structure.decorator.sollution.CondimentDecorator;

public class Mocha implements CondimentDecorator {
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
