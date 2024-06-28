package DesignPatterns.Behavioral.strategyDesignPattern;

import DesignPatterns.Behavioral.strategyDesignPattern.DuckBehaviour.FlyRocketPowered;

/**
 * 
 * @author ishant
 * This is a improved version of design for SimUDuck Design application, taken from "Head First Design Patterns book".
 * Here, we are trying to encapsulate all things that can make confusion when your codebase is increasing.
 * 
 * This is strategyDesignPattern:
 * Strategy lets the algorithm vary independently from clients that use it.
 * 
 * Real-life usecase:
 * Let's say you have to calculate sales tax for each different state of india.
 * So, that we can not use directly if-else statement, that can make code non-maintainable.
 * 
 * To make code reusable and maintainable, we need to encapsulate(or take out all things into different
 * packages) so that you have more maintained code.
 * 
 * See, class diagram for this duck app.
 * 
 * A main point is:
 * Lets suppose, if in future there is a requirement come, we have to add WalkBehaviour to our Duck.
 * So, our Duck class will be change and all classes that are extending to Duck class will be change.
 * So, is it correct? or we can go with any other path?
 */

public class Main {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		System.out.println("Mallard duck");
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("\nModel duck");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}
}
