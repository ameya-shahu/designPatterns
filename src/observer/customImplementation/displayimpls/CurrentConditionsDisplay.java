package observer.customImplementation.displayimpls;

import observer.customImplementation.displayElementInterfaces.DisplayElement;
import observer.customImplementation.observerinterfaces.Observer;
import observer.customImplementation.subjectinterfaces.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // Here, we may use weatherData reference to remove observer from further update
        //hence, this reference to weatherData is stored here.
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
