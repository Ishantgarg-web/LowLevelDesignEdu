package DesignPatterns.creational.factoryDesignPattern.pizzaType;

import DesignPatterns.creational.factoryDesignPattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago style cheese pizza name";
		dough = "Extra Thick crust dough";
		sauce = "Plum Tomato sauce";
		
		toppings.add("Mozzarella cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("cutting the pizza into square pieces");
	}
	
}
