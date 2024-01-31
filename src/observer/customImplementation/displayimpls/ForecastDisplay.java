package observer.customImplementation.displayimpls;

import observer.customImplementation.displayElementInterfaces.DisplayElement;
import observer.customImplementation.observerinterfaces.Observer;
import observer.customImplementation.subjectinterfaces.Subject;

public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // Here, we may use weatherData reference to remove observer from further update
        //hence, this reference to weatherData is stored here.
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Forecast Class data updated: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
