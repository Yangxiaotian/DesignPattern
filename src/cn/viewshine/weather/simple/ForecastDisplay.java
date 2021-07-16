package cn.viewshine.weather.simple;

public class ForecastDisplay implements Display{

    @Override
    public void update(float temp, float humi, float pres) {
        System.out.println(String.format("天气预报：温度 %.2f ℃，湿度 %.2f %%，气压 %.2f hPa", temp, humi, pres));
    }
}
