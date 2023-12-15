package org.pi.headfirstdesignpatterns.behaviour.observer.sollution;

public class CurrentConditionsDisplay extends Display implements Observer<WeatherData>  {
    private void display() {
        System.out.printf("Current conditions: %fF degrees and %f humidity\n", temperature, humidity);
    }

    @Override
    public void update(WeatherData data) {
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        this.pressure = data.getPressure();
        display();
    }
}
