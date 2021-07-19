package cn.viewshine.weather.correct;

public class HeatIndexDisplay implements Observer, DisplayElement{
    private float heatIndex;
    private Subject weatherData;
    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println(String.format("酷热指数：%.6f", heatIndex));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        float T = temperature;
        float RH = humidity;
        heatIndex = -42.379f + 2.04901523f*T + 10.14333127f*RH - 0.22475541f*T*RH
                - 6.83783f / 1000 *T*T - 5.481717f/100*RH*RH + 1.22874f/1000*T*T*RH + 8.5282f/10000*T*RH*RH - 1.99f/1000000*T*T*RH*RH;
        display();
    }
}
