package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class Squeak implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Quacking on Squeaking");
    }
}
