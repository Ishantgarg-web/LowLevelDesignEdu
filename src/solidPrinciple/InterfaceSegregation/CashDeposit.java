package solidPrinciple.InterfaceSegregation;

public class CashDeposit implements Deposit{

	@Override
	public void cashDeposit(int amount) {
		System.out.println("Deposited cash is: "+amount);
	}

}
