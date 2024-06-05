package solidPrinciple.SingleResponsibility;

public class CalculateBill extends Bill{

	private int itemQuantity;
	
	public CalculateBill(String name, int amount) {
		super(name, amount);
	}
	
	public void CalculateBill(int itemQuantity) {
		System.out.println(itemQuantity);
		System.out.println("Name: "+this.getName()+" and amount is: "+itemQuantity*this.getAmount());
	}

}
