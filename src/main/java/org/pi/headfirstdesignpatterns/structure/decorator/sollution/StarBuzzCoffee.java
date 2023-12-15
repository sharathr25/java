package org.pi.headfirstdesignpatterns.structure.decorator.sollution;

import org.pi.headfirstdesignpatterns.structure.decorator.sollution.beverages.DarkRoast;
import org.pi.headfirstdesignpatterns.structure.decorator.sollution.beverages.Espresso;
import org.pi.headfirstdesignpatterns.structure.decorator.sollution.condiments.Mocha;
import org.pi.headfirstdesignpatterns.structure.decorator.sollution.condiments.Soy;
import org.pi.headfirstdesignpatterns.structure.decorator.sollution.condiments.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        // without any condiments
        Beverage beverage1 = new DarkRoast();
        print(beverage1);

        // with condiment
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        print(beverage2);

        // with multiple condiments
        Beverage beverage3 = new Espresso();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Soy(beverage3);
        print(beverage3);
    }

    private static void print(Beverage beverage) {
        System.out.println(beverage.description() + ": " + beverage.cost());
    }
}
