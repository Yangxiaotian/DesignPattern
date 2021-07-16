package cn.viewshine.weather.simple;

public class StatisticsDisplay implements Display{
    @Override
    public void update(float temp, float humi, float pres) {
        System.out.println(String.format("统计面板：温度 %.2f ℃，湿度 %.2f %%，气压 %.2f hPa", temp, humi, pres));
    }
}
