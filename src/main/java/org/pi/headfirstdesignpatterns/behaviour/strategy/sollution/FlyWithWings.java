package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class FlyWithWings implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
