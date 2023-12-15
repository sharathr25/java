package org.pi.headfirstdesignpatterns.behaviour.observer.sollution;

public class ForecastDisplay extends Display implements Observer<WeatherData> {
    @Override
    public void update(WeatherData data) {
        this.temperature = data.getTemperature();
        this.humidity = data.getHumidity();
        this.pressure = data.getPressure();
        display();
    }

    private void display() {
        System.out.println("Weather is improving");
    }
}
