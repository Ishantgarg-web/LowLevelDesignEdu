package DesignPatterns.creational.factoryDesignPattern.pizzaType;

import DesignPatterns.creational.factoryDesignPattern.Pizza;
import DesignPatterns.creational.factoryDesignPattern.PizzaIngredientFactory;

public class DoughPizza extends Pizza{
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public DoughPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("preparing...in Dough Pizza "+name);
		dough = pizzaIngredientFactory.createDough();
		System.out.println("Tossing dough..."+dough);
	}
}
