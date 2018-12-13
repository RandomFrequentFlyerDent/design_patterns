package observerPattern;

import observerPattern.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
    private List<WeatherObserver> weatherObservers = new ArrayList<>();

    public void registerObserver(WeatherObserver o) {
        weatherObservers.add(o);
    }


    public void deleteObserver(WeatherObserver o) {
        weatherObservers.remove(o);
    }


    public void updateObserver() {
        for (WeatherObserver o : weatherObservers) {
            o.update();
        }

    }
}
