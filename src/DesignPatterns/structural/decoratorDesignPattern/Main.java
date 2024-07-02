package DesignPatterns.structural.decoratorDesignPattern;

import DesignPatterns.structural.decoratorDesignPattern.BeverageTypes.Espresso;
import DesignPatterns.structural.decoratorDesignPattern.BeverageTypes.HouseBlend;
import DesignPatterns.structural.decoratorDesignPattern.condimentDecoratorTypes.Mocha;
import DesignPatterns.structural.decoratorDesignPattern.condimentDecoratorTypes.Soy;
import DesignPatterns.structural.decoratorDesignPattern.condimentDecoratorTypes.Whip;

/**
 * 
 * @author ishant
 * problem statement: There is a coffee shop and you have some famous coffees like HouseBlend,
 * DarkRoast, Espresso, Decaf etc.
 * 
 * But your customers want some more toppings of some decorators like Milk, Mocha, Soy, Whip etc.
 * then its hard to express the description for each coffee at realtime.
 * 
 * Solution1: You can make a Beverage interface which has methods like getDescription() and getCost()
 * Now, which toppings you will need you can the extends this interface and define your class for each
 * customer.
 * 
 * This is a very bad solution, here the classes will make infinite, because toppings are vary for
 * each customer requirement.
 * 
 * Solution2: Based on the open-closed principle.(it means open for extension and closed for modification).
 * We will use Decorator Design Pattern.
 * Basically what we need here, is we have original coffee, and we need topping over that according
 * to customer requirements(means we can decide at runtime.)
 * 
 * for this, Let's we have to prepare a "dark roast mocha whip" beverage.
 * So, what we will do is, we first define whip decorator over mocha decorater over dark roast beverage.
 * 
 * So, to define this wisely and if you noticed well, you see mocha, whip, soy all decorators have same
 * behaviour that is of Beverage. i.e., getDescription(), getCost() method.
 * 
 * So, the class diagram will something like this
 * 
 *  Beverage interface -> getDescription(), cost()
 *  Concrete Components are -> HouseBlend, DarkRoast, Espresso, Decaf
 *  CondimentDecorator (have Beverage reference and getDescription()).
 *  all decorators such as Milk, Mocha, Soy, Whip are implement to the CondimentDecorator.
 *  
 *  // V0 completed.
 *  
 *  // New Requirement:
 *  New feature came that is size for each coffee. like now, we have three size of coffee(tall(small),
 *  grande(medium),venti(large)).
 *  and now for each decorator we have cost for each size like for Soy, cost for tall(.10), grande(0.15),
 *  venti(0.20).
 *  So, for understanding purpose, I am changing only class Soy based on their size.
 * 
 *  
 *  Real Time use case:
 *  -> used in Java I/O libraries implementation.
 *  -> Refer pg No. 100 of book
 */


public class Main {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " "+espresso.cost()+" "+espresso.getSize());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println("Beverage with double Mocha and Whip is: \n"+beverage2.getDescription()+" "+beverage2.cost());
	}
	
}
