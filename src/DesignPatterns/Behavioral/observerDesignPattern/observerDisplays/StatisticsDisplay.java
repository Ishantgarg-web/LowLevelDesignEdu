package DesignPatterns.Behavioral.observerDesignPattern.observerDisplays;

import DesignPatterns.Behavioral.observerDesignPattern.Display;
import DesignPatterns.Behavioral.observerDesignPattern.Observer;
import DesignPatterns.Behavioral.observerDesignPattern.WeatherData;

public class StatisticsDisplay implements Observer,Display{

	private float temp;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("StatisticsDisplay:\nCurrent Temperature: "+this.temp+" and humidity is: "+this.humidity+" "
				+ "and pressure is: "+this.pressure);
	}

	@Override
	public void update() {
		this.temp = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		this.pressure = weatherData.getPressure();
		display();
	}

}
