package solidPrinciple.SingleResponsibility;


/**
 * 
 * @author ishant
 * SRP: Single Responsibility Principle means only 1 actor can change this(class, package,
 * set of functions, manageable code)
 * 
 * it does not means only 1 class have single responsibility. while we have to make sure that only 1
 * actor can be responsible for change that particular code.
 * 
 * it can be better solve using Facade pattern.
 * 
 * Example: There is a class named "Bill" that have three important functions are:
 * calculateBill()
 * printBill()
 * saveBill()
 * 
 * But, in future if we need to change the implementation of saveBill(), and we need to add "isPaid"
 * field in Bill class, but it will impact other functions unnecessary.
 * So, to solve this we will create three different classes for each functionality.
 * named: CalculateBill, PrintBill, SaveBill
 * 	
 */

public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
		CalculateBill cb = new CalculateBill("ishant", 100);
		cb.CalculateBill(50);
		
		PrintBill pb = new PrintBill("ishant", 100);
		pb.PrintBill(1);
	}
}
