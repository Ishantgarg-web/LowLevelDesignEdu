package DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour;

public class MuteQuack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("no sound - muted quack");
	}

}
