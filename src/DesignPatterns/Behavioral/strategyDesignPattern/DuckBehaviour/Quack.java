package DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour;

public class Quack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("it quacks");
	}
	
}
