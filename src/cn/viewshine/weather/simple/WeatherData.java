package cn.viewshine.weather.simple;

public class WeatherData {
    private float temperature = 36.3f;
    private float humidity = 60.83f;
    private float pressure = 1003;

    Display currentConditionDisplay = new CurrentConditionsDisplay();
    Display statisticsDisplay = new StatisticsDisplay();
    Display forecastDisplay = new ForecastDisplay();

    public float getHumidity() {
        return humidity;
    }
    public float getTemperature() {
        return temperature;
    }
    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged(float temperature, float humidity, float pressure) {
        float temp = getTemperature();
        float humi = getHumidity();
        float pres = getPressure();
        currentConditionDisplay.update(temp, humi, pres);
        statisticsDisplay.update(temp, humi, pres);
        forecastDisplay.update(temp, humi, pres);
    }
}
