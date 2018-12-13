package observerPattern;

import observerPattern.observer.HumidityObserver;
import observerPattern.observer.TemperatureObserver;

public class WeatherMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new HumidityObserver());
        weatherData.registerObserver(new TemperatureObserver());
    }
}
