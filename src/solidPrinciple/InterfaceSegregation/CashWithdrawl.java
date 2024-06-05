package solidPrinciple.InterfaceSegregation;

public class CashWithdrawl implements Withdrawl{

	@Override
	public void cashWithdrawl(int amount) {
		System.out.println("Cash withdrawl is: "+amount);
	}

}
