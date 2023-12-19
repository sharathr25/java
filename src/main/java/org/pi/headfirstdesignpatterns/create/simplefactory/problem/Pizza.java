package org.pi.headfirstdesignpatterns.create.simplefactory.problem;

public class Pizza {
    void prepare() {
        System.out.println("prepare pizza");
    }

    void bake() {
        System.out.println("bake pizza");
    }

    void cut() {
        System.out.println("cut pizza");
    }

    void box() {
        System.out.println("box pizza");
    }
}
