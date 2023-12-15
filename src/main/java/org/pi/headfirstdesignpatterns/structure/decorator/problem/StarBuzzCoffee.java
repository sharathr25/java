package org.pi.headfirstdesignpatterns.structure.decorator.problem;

import org.pi.headfirstdesignpatterns.structure.decorator.problem.beverages.DarkRoast;
import org.pi.headfirstdesignpatterns.structure.decorator.problem.beverageswithcondiments.DarkRoastWithWhipAndSoy;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();

        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());

        Beverage darkRoastWithWhipAndSoy = new DarkRoastWithWhipAndSoy();

        System.out.println(darkRoastWithWhipAndSoy.getDescription());
        System.out.println(darkRoastWithWhipAndSoy.cost());
    }
}
