package chapter2.wObservable;

import chapter2.wObservable.concreteObserver.CurrentConditionsDisplay;
import chapter2.wObservable.concreteSubject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		//weatherData.setMeasurements(82, 61, 32.4f);
		//weatherData.setMeasurements(72, 67, 39.4f);
		
		
	}
}
