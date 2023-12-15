package org.pi.headfirstdesignpatterns.behaviour.observer.problem;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    // whenever we change weather data we need to update this display
    // But, what to do when add a new display
    // we need to update that as well and this goes on whenever we want to add a display
    // and this will create a tight coupling between display and weather data
    // we can avoid this by using observer pattern where we kind of notify about the data change
    // and who ever listening to this notification can take action accordingly
    private final CurrentConditionsDisplay currentConditionsDisplay;

    public WeatherData(CurrentConditionsDisplay currentConditionsDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        currentConditionsDisplay.update(temperature, humidity, pressure);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measurementChanged();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measurementChanged();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementChanged();
    }
}
