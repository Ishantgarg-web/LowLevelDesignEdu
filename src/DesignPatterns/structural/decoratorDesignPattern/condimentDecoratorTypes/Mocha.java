package DesignPatterns.structural.decoratorDesignPattern.condimentDecoratorTypes;

import DesignPatterns.structural.decoratorDesignPattern.Beverage;
import DesignPatterns.structural.decoratorDesignPattern.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}
	
}
