package cn.viewshine.weather.correct;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    private float getTemperature() {
        return temperature;
    }
    private float getHumidity() {
        return humidity;
    }
    private float getPressure() {
        return pressure;
    }
    @Override
    public void notifyObservers() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        for(Observer o: observers)
            o.update(temp, humidity, pressure);
    }
    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }
}
