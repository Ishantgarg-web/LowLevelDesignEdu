package DesignPatterns.structural.adaptorDesignPattern;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("its mallard duck quack");
	}

	@Override
	public void fly() {
		System.out.println("its mallard duck fly");
	}
	
}
