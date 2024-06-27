package DesignPatterns.Behavioral.strategyDesignPattern;

import DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour.FlyBehaviour;
import DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour.QuackBehaviour;

public abstract class Duck {
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys");
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public abstract void display();
}	
