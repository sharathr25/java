package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public abstract class Duck {
    protected FlyingBehaviour flyingBehaviour;
    protected QuackingBehaviour quackingBehaviour;

    public void swim() {
        System.out.println("Swimming");
    }

    public void performQuack() {
        quackingBehaviour.quack();
    }

    public void performFly() {
        flyingBehaviour.fly();
    }

    public abstract void display();
}
