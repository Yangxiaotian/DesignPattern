package cn.viewshine.weather.usejdk;

import org.omg.CORBA.Current;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(35, 65, 1003.5f);
        weatherData.setMeasurements(36.3f, 43.2f, 1005.1f);
        weatherData.setMeasurements(33.5f, 59, 1002.9f);
    }
}
