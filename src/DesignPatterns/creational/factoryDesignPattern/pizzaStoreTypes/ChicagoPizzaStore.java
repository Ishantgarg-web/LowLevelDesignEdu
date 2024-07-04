package DesignPatterns.creational.factoryDesignPattern.pizzaStoreTypes;

import DesignPatterns.creational.factoryDesignPattern.ChicagoIngredientFactory;
import DesignPatterns.creational.factoryDesignPattern.Pizza;
import DesignPatterns.creational.factoryDesignPattern.PizzaIngredientFactory;
import DesignPatterns.creational.factoryDesignPattern.PizzaStore;
import DesignPatterns.creational.factoryDesignPattern.pizzaType.ChicagoStyleCheesePizza;
import DesignPatterns.creational.factoryDesignPattern.pizzaType.DoughPizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();
		
		if(type.equals("dough")) {
			pizza = new DoughPizza(pizzaIngredientFactory);
			pizza.setName("Chicago style cheese pizza");
			return pizza;
		}
		return null;
	}

}
