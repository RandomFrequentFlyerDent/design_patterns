package observerPattern;


import observerPattern.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData extends WeatherSubject {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setTemperature(float temperature) {
        if (this.temperature != temperature) {
            this.temperature = temperature;
            measurementsChanged();
        }
    }

    public void setHumidity(float humidity) {
        if (this.humidity != humidity) {
            this.humidity = humidity;
            measurementsChanged();
        }
    }

    public void setPressure(float pressure) {
        if (this.pressure != pressure) {
            this.pressure = pressure;
            measurementsChanged();
        }
    }

    public void measurementsChanged() {
        updateObserver();
    }
}
