package DesignPatterns.structural.adaptorDesignPattern;

public class TurkeyDuck implements Turkey{

	@Override
	public void gobble() {
		System.out.println("its turkey gobble");
	}

	@Override
	public void fly() {
		System.out.println("its turkey fly");
	}

}
