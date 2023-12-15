package org.pi.headfirstdesignpatterns.behaviour.strategy.problem;

public abstract class Duck {
    public void quack() {
        System.out.println("Quack Quack!");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void fly() { // problem: not all ducks can fly
        System.out.println("Flying");
    }

    public abstract void display();
}
