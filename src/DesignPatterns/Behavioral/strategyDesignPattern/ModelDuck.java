package DesignPatterns.Behavioral.strategyDesignPattern;

import DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour.FlyNoWay;
import DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck");
	}
	
}
