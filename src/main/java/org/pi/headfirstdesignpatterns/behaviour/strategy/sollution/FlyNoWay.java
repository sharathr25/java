package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class FlyNoWay implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
