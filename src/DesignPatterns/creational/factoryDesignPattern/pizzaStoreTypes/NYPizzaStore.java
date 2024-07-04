package DesignPatterns.creational.factoryDesignPattern.pizzaStoreTypes;

import DesignPatterns.creational.factoryDesignPattern.NYIngredientFactory;
import DesignPatterns.creational.factoryDesignPattern.Pizza;
import DesignPatterns.creational.factoryDesignPattern.PizzaIngredientFactory;
import DesignPatterns.creational.factoryDesignPattern.PizzaStore;
import DesignPatterns.creational.factoryDesignPattern.pizzaType.DoughPizza;
import DesignPatterns.creational.factoryDesignPattern.pizzaType.NYStyleCheezePizza;

public class NYPizzaStore extends PizzaStore{
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory nyPizzaIngredientFactory = new NYIngredientFactory();
		
		if(type.equals("dough")) {
			pizza = new DoughPizza(nyPizzaIngredientFactory);
			pizza.setName("NY style cheese pizza");
			return pizza;
		}
		return null;
	}

}
