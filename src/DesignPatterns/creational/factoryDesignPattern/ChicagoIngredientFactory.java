package DesignPatterns.creational.factoryDesignPattern;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{

	@Override
	public String createDough() {
		return "preparing thick crust dough";
	}

}
