package DesignPatterns.structural.facadeDesignPattern.Menus;

public class VegNonVegBothMenu implements Menus{

	@Override
	public void getMenu() {
		System.out.println("Both Veg and non-veg menu");
	}

}
