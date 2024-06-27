package DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour;

public class Squeak implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("it squeaks");
	}

}
