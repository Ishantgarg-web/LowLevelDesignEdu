package DesignPatterns.structural.adaptorDesignPattern;

public class TurkeyAdaptee implements Duck{
	
	/**
	 * This will help us to convert Turkey to Duck, So we implements this adapter to Duck
	 */
	Turkey turkeyDuck;
	
	public TurkeyAdaptee(Turkey turkeyDuck) {
		this.turkeyDuck = turkeyDuck;
	}
	
	@Override
	public void quack() {
		turkeyDuck.gobble();
	}

	@Override
	public void fly() {
		for (int i=0;i<5;i++) {
			turkeyDuck.fly();
		}
	}

}
