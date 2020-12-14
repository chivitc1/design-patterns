package demo4.impl;

import demo4.DisplayElement;
import demo4.Observer;
import demo4.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("-----------Current condition-----------");
        System.out.format("- %.2f F degrees\n- %.2f %% humidity", this.temperature, this.humidity);
        System.out.println("---------------------------------------");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
