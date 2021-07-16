package cn.viewshine.weather.simple;

public class CurrentConditionsDisplay implements Display{
    @Override
    public void update(float temp, float humi, float pres) {
        System.out.println(String.format("实时天气播报：温度 %.2f ℃，湿度 %.2f %%，气压 %.2f hPa", temp, humi, pres));
    }
}
