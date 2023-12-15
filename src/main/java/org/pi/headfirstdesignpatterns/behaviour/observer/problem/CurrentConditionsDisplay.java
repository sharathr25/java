package org.pi.headfirstdesignpatterns.behaviour.observer.problem;

public class CurrentConditionsDisplay extends Display {
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.printf("Current conditions: %fF degrees and %f humidity\n", temperature, humidity);
    }
}
