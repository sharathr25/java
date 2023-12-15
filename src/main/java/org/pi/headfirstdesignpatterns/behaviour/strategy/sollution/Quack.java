package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class Quack implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack!");
    }
}
