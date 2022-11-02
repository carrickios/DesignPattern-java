package SystemObserver;

import SystemObserver.Datas.WeatherData;
import SystemObserver.Display.CurrentCoditionsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCoditionsDisplay currentCoditionsDisplay = new CurrentCoditionsDisplay(weatherData);
        weatherData.setMeaserements(80, 65, 30.4f);
        weatherData.setMeaserements(82, 70, 29.2f);
        weatherData.setMeaserements(78, 90, 19.2f);
    }
}
