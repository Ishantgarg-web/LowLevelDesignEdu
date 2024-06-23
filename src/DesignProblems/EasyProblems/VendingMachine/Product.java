package DesignProblems.EasyProblems.VendingMachine;

public class Product {
	private int productCodeNumber;
	private String name;
	private int price;
	private int quantity;
	
	public int getProductCodeNumber() {
		return productCodeNumber;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public Product(int productCodeNumber, String name, int price, int quantity) {
		super();
		this.productCodeNumber = productCodeNumber;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
}
