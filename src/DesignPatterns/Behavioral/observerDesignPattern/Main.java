package DesignPatterns.Behavioral.observerDesignPattern;

import DesignPatterns.Behavioral.observerDesignPattern.observerDisplays.CurrentConditionsDisplay;
import DesignPatterns.Behavioral.observerDesignPattern.observerDisplays.StatisticsDisplay;

/**
 * 
 * @author Ishant
 * Observer Design Pattern: This patterns comes under Behavioral Design Pattern, that used to decide
 * the behaviour of objects.
 * 
 * Here, subject is present which will behave like publisher.
 * and multiple observers are there which will behave like consumer(that will consume the data from
 * publishers).
 * 
 * ProblemStatement: We have a WeatherData class that is getting data from sensers for the keys like
 * temperature, humidity, pressure.
 * and there are multiple screens(or displays) available at the user end, they will utilize this data and show to
 * the users through these multiple displays.
 * 
 * it can be extend to in future with keys can be added more and displays can be added more.
 * 
 * So, Here the concept came for pulbisher and consumers, so we will implement here observer design pattern.
 */

public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurement(8, 65, 30.4f);
		weatherData.unRegisterObserver(statisticsDisplay);
		weatherData.setMeasurement(10, 45, 30.4f);
		
		// Version v0 is completed.
	}
}
