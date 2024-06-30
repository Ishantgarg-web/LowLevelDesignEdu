package DesignPatterns.structural.decoratorDesignPattern;

public abstract class CondimentDecorator extends Beverage{
	
	protected Beverage beverage;
	public abstract String getDescription();

}
