package org.pi.headfirstdesignpatterns.behaviour.observer.sollution;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataObservable implements Observable<WeatherData> {
    private final WeatherData weatherData;
    private final List<Observer<WeatherData>> observers;

    WeatherDataObservable() {
        observers = new ArrayList<>();
        weatherData = new WeatherData();
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setTemperature(float temperature) {
        weatherData.setTemperature(temperature);
        measurementChanged();
    }

    public void setHumidity(float humidity) {
        weatherData.setHumidity(humidity);
        measurementChanged();
    }

    public void setPressure(float pressure) {
        weatherData.setPressure(pressure);
        measurementChanged();
    }

    @Override
    public void addObserver(Observer<WeatherData> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<WeatherData> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<WeatherData> observer : observers) {
            observer.update(weatherData);
        }
    }
}
