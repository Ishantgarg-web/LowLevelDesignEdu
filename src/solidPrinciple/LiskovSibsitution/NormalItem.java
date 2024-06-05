package solidPrinciple.LiskovSibsitution;

public class NormalItem extends MenuItem{

	public NormalItem(String itemName, double price) {
		super(itemName, price);
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
}
