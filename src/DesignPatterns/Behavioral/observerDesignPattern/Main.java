package DesignPatterns.Behavioral.observerDesignPattern;

import DesignPatterns.Behavioral.observerDesignPattern.observerDisplays.CurrentConditionsDisplay;
import DesignPatterns.Behavioral.observerDesignPattern.observerDisplays.HeatIndexDisplay;
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
 * ProblemStatement(V0): We have a WeatherData class that is getting data from sensers for the keys like
 * temperature, humidity, pressure.
 * and there are multiple screens(or displays) available at the user end, they will utilize this data and show to
 * the users through these multiple displays.
 * 
 * it can be extend to in future with keys can be added more and displays can be added more.
 * 
 * So, Here the concept came for pulbisher and consumers, so we will implement here observer design pattern.
 * 
 * V0 implementation done: till here it is working fine according to the functionality.
 * 
 * New Requirement comes(V1):
 * There is other index called heatindex which will be calculated using temperature and relative humidity
 * and there is a very long formula(for simplicity, I am adding up both the values for displaying).
 * So, integrate the headindex display for displaying the headindex also.
 * 
 * Need to do:
 * -> Add one more Display named HeatIndexDisplay
 * -> it will take temperature and humitdity from weatherData and then we will display this.
 * 
 * problem with this approach:
 * -> Here, we are passing weatherData object to displays, they can use in other way also.
 * -> if in future we need to append one more sensor, to get data and sent it to observers, we need to
 *    update multiple methods in this approach, this is also not a good behaviour.
 * So, to overcome all of this, we need to change our code to make it more efficient.
 * 
 * 
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
		
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		weatherData.setMeasurement(19, 20, 320.4f);
	}
}
