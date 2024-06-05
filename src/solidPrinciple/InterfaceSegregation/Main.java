package solidPrinciple.InterfaceSegregation;

/**
 * 
 * @author ishant
 * Interface Segregation Principle: One interface should not be handling a lot of responsibilities
 * while multiple interfaces should be handling different responsibilities.
 * Basically, it is SRP for interfaces.
 * Example:
 * Suppose there is a single machine, that can support Cash Withdrawl+Cash deposit. So, for a
 * client(or customer) that uses this machine can have a issue, a single customer dont do both things
 * at same time. So, we can seperate them.
 */

public class Main {
	public static void main(String[] args) {
		Deposit d = new CashDeposit();
		d.cashDeposit(100);
		Withdrawl w = new CashWithdrawl();
		w.cashWithdrawl(100);
	}
}
