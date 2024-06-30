package DesignPatterns.structural.decoratorDesignPattern.condimentDecoratorTypes;

import DesignPatterns.structural.decoratorDesignPattern.Beverage;
import DesignPatterns.structural.decoratorDesignPattern.CondimentDecorator;

public class Soy extends CondimentDecorator{
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		if(beverage.getSize().equals(Size.TALL)) {
			return beverage.getDescription() + "Tall Soy";
		}else if(beverage.getSize().equals(Size.GRANDE)) {
			return beverage.getDescription() + "GRANDE Soy";
		}else {
			return beverage.getDescription() + "Venti Soy";
		}
	}

	@Override
	public double cost() {
		if(beverage.getSize().equals(Size.TALL)) {
			return beverage.cost() + 0.10;
		}else if(beverage.getSize().equals(Size.GRANDE)) {
			return beverage.cost() + 0.15;
		}else {
			return beverage.cost() + 0.20;
		}
	}

}
