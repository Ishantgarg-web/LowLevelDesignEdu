package DesignPatterns.structural.adaptorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

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
 * [NEW_REQUIREMENT]:
 * problem_statement: There is a inbuilt java legacy interface Enumeration, that has two functions
 * hasNextElements() and nextElement(), but now all collections uses Iterator interface that has three
 * functions hasNext(), next(), remove(). So you need to make a converterFromEnumerationToIterator
 * and fromInteratorToEnumeration.
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
		
		// use case of IteratorToEnumeration convertor.
		// we will take an ArrayList that support iterator interface but not Enumerations.
		ArrayList<Integer> al = new ArrayList<>();
		al.addAll(Arrays.asList(1,2,3,5,6,10));
		Iterator<Integer> iterator = al.iterator();
		Enumeration<Object> enumeration = new IteratorToEnumeration(iterator);
		while(enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+" ");
		}
	}
}
