package DesignPatterns.creational.factoryDesignPattern.pizzaType;


import DesignPatterns.creational.factoryDesignPattern.Pizza;

public class NYStyleCheezePizza extends Pizza{

	public NYStyleCheezePizza() {
		name = "NY style sauce and cheese pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
