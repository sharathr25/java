package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class RubberDuck extends Duck {
    RubberDuck() {
        flyingBehaviour = new FlyNoWay();
        quackingBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Rubber duck");
    }
}
