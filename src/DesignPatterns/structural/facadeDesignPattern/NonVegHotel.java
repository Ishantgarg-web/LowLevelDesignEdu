package DesignPatterns.structural.facadeDesignPattern;

import DesignPatterns.structural.facadeDesignPattern.Menus.Menus;
import DesignPatterns.structural.facadeDesignPattern.Menus.NonVegMenu;

public class NonVegHotel implements Hotel{

	@Override
	public Menus getMenus() {
		NonVegMenu ng = new NonVegMenu();
		ng.getMenu();
		return ng;
	}

}
