package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class MuteQuack implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Can't Quack");
    }
}
