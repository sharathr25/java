package org.pi.designpatterns.simplefactory;

public class CarWheel implements Wheel {
    private float radius;

    CarWheel(float radius) {
        this.radius = radius;
    }

    @Override
    public float getRadius() {
        return this.radius;
    }
}
