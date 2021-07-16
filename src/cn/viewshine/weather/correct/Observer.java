package cn.viewshine.weather.correct;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
