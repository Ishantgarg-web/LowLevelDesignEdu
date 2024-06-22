package DesignPatterns.structural.facadeDesignPattern;

import DesignPatterns.structural.facadeDesignPattern.Menus.Menus;
import DesignPatterns.structural.facadeDesignPattern.Menus.VegNonVegBothMenu;

public class BothHotel implements Hotel{

	@Override
	public Menus getMenus() {
		VegNonVegBothMenu both = new VegNonVegBothMenu();
		both.getMenu();
		return both;
	}
	
}
