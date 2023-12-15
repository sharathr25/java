package org.pi.headfirstdesignpatterns.behaviour.observer.sollution;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();

        // Now we can observe changes in weather data
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        weatherDataObservable.addObserver(currentConditionsDisplay);

        // triggering change
        weatherDataObservable.setTemperature(80.0f);
        weatherDataObservable.setHumidity(65.0f);
        weatherDataObservable.setPressure(8);

        // If we don't want to observe we can do that as well
        weatherDataObservable.removeObserver(currentConditionsDisplay);

        // we can add new display as well, which will observe
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherDataObservable.addObserver(forecastDisplay);

        // triggering change
        weatherDataObservable.setTemperature(80.0f);
        weatherDataObservable.setHumidity(65.0f);
        weatherDataObservable.setPressure(8);
    }
}
