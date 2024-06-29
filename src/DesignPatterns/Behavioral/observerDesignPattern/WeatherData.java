package DesignPatterns.Behavioral.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void unRegisterObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update();
		}
	}
	
	public void setMeasurement(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanges();
	}

	private void measurementsChanges() {
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
