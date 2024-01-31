package observer.builtinJavaImplementation.observerImpls;

import observer.builtinJavaImplementation.subjectImpls.WeatherDataObservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataObservable){
            WeatherDataObservable weatherData = (WeatherDataObservable) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
