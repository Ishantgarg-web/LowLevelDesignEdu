package DesignPatterns.Behavioral.strategyDesignPattern;

import DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour.FlyWithWings;
import DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a mallard duck");
	}
	
	
}
