package org.pi.headfirstdesignpatterns.behaviour.strategy.problem;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();

        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.fly();

        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        // this is wrong,
        // rubber duck can't fly.
        // but still rubber duck is flying since it's parent class have fly method.
        // And this problem happens when we implement new type of Duck class which can't fly
        rubberDuck.fly();
    }
}
