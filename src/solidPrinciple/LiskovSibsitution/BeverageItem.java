package solidPrinciple.LiskovSibsitution;

public class BeverageItem extends MenuItem{

	public BeverageItem(String itemName, double price) {
		super(itemName, price);
	}
	
	@Override
	public double getPrice() {
		return this.price - this.getDiscount();
	}
	
	private double getDiscount() {
		return 10;
	}
}
