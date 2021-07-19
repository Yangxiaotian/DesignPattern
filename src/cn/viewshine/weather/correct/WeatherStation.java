package cn.viewshine.weather.correct;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(35, 65, 1003.5f);
        weatherData.setMeasurements(36.3f, 43.2f, 1005.1f);
        weatherData.setMeasurements(33.5f, 59, 1002.9f);

    }
}
