package solidPrinciple.DependencyInversion;

/**
 * 
 * @author ishant
 * it states that
 * High level modules does not depend on low-level modules.
 * Both should depend on abstractions
 * Abstraction should not depend on implementation
 * implementation should depend on abstraction.
 * 
 * Example:
 * Class A -> depends on Class B
 * Class B -> depends on Class C
 * 
 * So, Here problem is: if anything change in Class B, it will impact class A.
 * second problem is: if we write unit test cases in future, then for writing the test case for class A
 * we need to do mocking for Class B, and for Class B, for Class C.
 * 
 * Solution:
 * class A, class B -> interface B
 * class C, interface B -> interface C.
 * 
 * So, anything changed happen in class B, or class C does not effect class A
 * and same for unit test cases, we can mock easily interface functions because they are only abstraction
 * not implementation.
 */

public class Main {
	public static void main(String[] args) {
		
	}
}
