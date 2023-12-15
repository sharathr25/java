package org.pi.headfirstdesignpatterns.behaviour.strategy.sollution;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        woodenDuck.display();
        woodenDuck.swim();
        woodenDuck.performFly();
        woodenDuck.performQuack();
    }
}
