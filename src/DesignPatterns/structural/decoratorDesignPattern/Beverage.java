package DesignPatterns.structural.decoratorDesignPattern;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	public enum Size{
		TALL,
		GRANDE,
		VENTI
	}
	protected Size size = Size.TALL;
	public Size getSize() {
		return this.size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
