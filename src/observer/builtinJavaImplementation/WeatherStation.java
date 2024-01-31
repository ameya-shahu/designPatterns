package observer.builtinJavaImplementation;

import observer.builtinJavaImplementation.observerImpls.CurrentConditionDisplay;
import observer.builtinJavaImplementation.subjectImpls.WeatherDataObservable;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDataObservable);
        weatherDataObservable.setMeasurements(80, 65, 30.4f);
    }
}
