package demo4;

import demo4.impl.CurrentConditionDisplay;
import demo4.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        CurrentConditionDisplay display = new CurrentConditionDisplay(data);
        data.setMeasurements(80, 65, 30.4f);
        data.setMeasurements(82, 70, 29.2f);
        data.setMeasurements(77, 75, 31.4f);
    }
}
