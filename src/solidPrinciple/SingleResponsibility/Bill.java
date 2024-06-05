package solidPrinciple.SingleResponsibility;

public class Bill {
	private String name;
	private int amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Bill(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Bill [name=" + name + ", amount=" + amount + "]";
	}
	
}
