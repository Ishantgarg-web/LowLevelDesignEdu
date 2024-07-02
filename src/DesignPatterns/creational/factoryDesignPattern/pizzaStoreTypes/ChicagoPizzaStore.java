package DesignPatterns.creational.factoryDesignPattern.pizzaStoreTypes;

import DesignPatterns.creational.factoryDesignPattern.Pizza;
import DesignPatterns.creational.factoryDesignPattern.PizzaStore;
import DesignPatterns.creational.factoryDesignPattern.pizzaType.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}
		return null;
	}

}
