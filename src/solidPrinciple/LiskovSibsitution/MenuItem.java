package solidPrinciple.LiskovSibsitution;

public class MenuItem {
	public String itemName;
	public double price;
	
	public MenuItem(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
