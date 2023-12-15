package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class MallardDuck extends Duck {
    MallardDuck() {
        flyingBehaviour = new FlyWithWings();
        quackingBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
