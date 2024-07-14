package DesignPatterns.structural.adaptorDesignPattern;

/**
 * 
 * @author ishant
 * Adaptor Design Pattern: it converts the interface of a class into other interface that client expects.
 * Adaptor lets classes work together that couldn't otherwise because of incompatible interfaces.
 * 
 * why we need?
 * Let's say you have an existing system and you used some vendor A in your code, but now you need to change
 * vendorA to vendorB. Now, the problem is vendorB have their own code and that might not be compatible
 * with vendorA code.
 * 
 * So, you have two options: change the existing code, this is not feasible in all the situations.
 * or else you can use the adaptor between the vendorA and vendorB, so that where our code calls the
 * vendorA, now it calls the adaptor between the two, its responsibility is to convert vendorA to
 * vendorB.
 * 
 * Main Components of Adaptor Design Pattern:
 * target interface: to which we have to change, vendorB
 * adaptee: who needs to change, vendorA
 * adaptor: it will implements the target interface and take the input of adaptee. and convert from
 * 			adaptee to target interface.
 * 
 * Problem Statement:
 * We have a duck that can quack() and fly() and we have a turkey duck that can gobble() not quack,
 * but it can fly()(with less distance than duck distance).
 * 
 * but your existing system uses duck everywhere now requirement is you have to embed the turkey duck
 * also in it.
 * 
 */



public class Main {
	public static void main(String[] args) {
		// define the MallardDuck
		Duck mallardDuck = new MallardDuck();
		mallardDuck.quack();
		mallardDuck.fly();
		
		Turkey turkeyDuck = new TurkeyDuck();
		Duck turkeyDuckConverted = new TurkeyAdaptee(turkeyDuck);
		turkeyDuckConverted.quack();
		turkeyDuckConverted.fly();
	}
}
