package DesignPatterns.creational.factoryDesignPattern;

import DesignPatterns.creational.factoryDesignPattern.pizzaStoreTypes.ChicagoPizzaStore;
import DesignPatterns.creational.factoryDesignPattern.pizzaStoreTypes.NYPizzaStore;

/**
 * 
 * @author ishant
 * Problem Statement: how will you handle the object creation part.
 * 
 * Factory Design Pattern: A factory method handles object creation and encapsulates it in a subclass.
 * This decouples the client code in the superclass from the object creation code in the subclass.
 * 
 * Problem Statement: There is a pizza store which create pizza for different types like CheesePizza,
 * VeggiePizza, ClamPizza, PepperoniPizza.
 * 
 * you have different stores also for your pizza factory like in NY, Chicago, California. and all stores
 * have different taste for the pizza, So how would you define this.
 * 
 * New requirement: Now, Cheese, Veggie all ingredients are also different for each region like for NY,
 * Chicago it is different.
 * 
 * for the implement of this use case, we will make another Factory called PizzaIngredientFactory that
 * is responsible for creating the ingredients based on region. and this is called Abstract Factory
 * Design Pattern.
 * 
 * Abstract Factory Design Pattern: it provide an abstract interface for creating a family of products.
 * 
 */


public class Main {
	public static void main(String[] args) {
		/**
		 * Test: Ethan need to order NY Pizza
		 * and Joel need to order Chicago Pizza.
		 */
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza ethanPizza =  nyPizzaStore.orderPizza("dough");
		System.out.println("Ethan ordered a: "+ethanPizza.getName());
		System.out.println("----------------------------------");
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		Pizza joelPizza =  chicagoPizzaStore.orderPizza("dough");
		System.out.println("Joel ordered a: "+joelPizza.getName());
	}
}
