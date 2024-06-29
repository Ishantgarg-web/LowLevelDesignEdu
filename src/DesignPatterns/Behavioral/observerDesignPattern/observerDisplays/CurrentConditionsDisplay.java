package DesignPatterns.Behavioral.observerDesignPattern.observerDisplays;

import DesignPatterns.Behavioral.observerDesignPattern.Display;
import DesignPatterns.Behavioral.observerDesignPattern.Observer;
import DesignPatterns.Behavioral.observerDesignPattern.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display{
	
	private float temp;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("CurrentConditionsDisplay:\nCurrent Temperature: "+this.temp+" and humidity is: "+this.humidity+" "
				+ "and pressure is: "+this.pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
