package chapter2.woObservable.concreteObserver;

import chapter2.woObservable.observer.DisplayElement;
import chapter2.woObservable.observer.Observer;
import chapter2.woObservable.subject.Subject;

public class ThirdPartyDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public ThirdPartyDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + 
				"F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
