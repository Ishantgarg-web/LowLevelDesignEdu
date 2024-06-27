package DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour;

public class FlyWithWings implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("its flying");
	}

}
