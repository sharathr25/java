package org.pi.designpatterns.factory;

public class Executor {
    public static void main(String[] args) {
        Wheel carWheel = WheelFactory.makeWheel(10.5f);
        System.out.println(carWheel.getRadius());
    }
}
