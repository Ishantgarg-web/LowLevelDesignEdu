package solidPrinciple.SingleResponsibility;

public class PrintBill extends Bill{
	
	public PrintBill(String name, int amount) {
		super(name, amount);
	}

	private int printerType;
	
	public void PrintBill(int printerType) {
		System.out.println("printing bill for name: "+this.getName()+" and amount is: "+this.getAmount()+""
				+ " and used printer is: "+printerType);
	}
	
}
