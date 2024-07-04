package DesignPatterns.creational.factoryDesignPattern;

public class NYIngredientFactory implements PizzaIngredientFactory{

	@Override
	public String createDough() {
		return "preparing thin crust dough";
	}

}
