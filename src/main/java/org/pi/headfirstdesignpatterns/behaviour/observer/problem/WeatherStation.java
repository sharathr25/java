package org.pi.headfirstdesignpatterns.behaviour.observer.problem;

public class WeatherStation {
    public static void main(String[] args) {
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        WeatherData weatherData = new WeatherData(currentConditionsDisplay);
        weatherData.setTemperature(80.0f);
        weatherData.setHumidity(65.0f);
        weatherData.setPressure(8);
    }
}
