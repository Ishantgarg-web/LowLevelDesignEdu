package DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour;

public class FlyNoWay implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("not flying");
	}

}
