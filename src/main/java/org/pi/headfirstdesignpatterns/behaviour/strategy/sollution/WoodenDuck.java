package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class WoodenDuck extends Duck {
    WoodenDuck() {
        flyingBehaviour = new FlyNoWay();
        quackingBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Wooden duck");
    }
}
