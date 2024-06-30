package DesignPatterns.structural.decoratorDesignPattern.condimentDecoratorTypes;

import DesignPatterns.structural.decoratorDesignPattern.Beverage;
import DesignPatterns.structural.decoratorDesignPattern.CondimentDecorator;

public class Soy extends CondimentDecorator{
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}

}
