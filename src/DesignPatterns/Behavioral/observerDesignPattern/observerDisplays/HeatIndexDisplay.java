package DesignPatterns.Behavioral.observerDesignPattern.observerDisplays;

import DesignPatterns.Behavioral.observerDesignPattern.Display;
import DesignPatterns.Behavioral.observerDesignPattern.Observer;
import DesignPatterns.Behavioral.observerDesignPattern.WeatherData;

public class HeatIndexDisplay implements Observer, Display{
	
	private WeatherData weatherData;
	private float temperature;
	private float humidity;
	
	public HeatIndexDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("HeatIndexDisplay:\nTemperature is: "+temperature+" and humidity is: "+humidity+""
				+ "and heatindex is: "+(temperature+humidity));
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
	
}
