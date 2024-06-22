package DesignPatterns.structural.facadeDesignPattern;

import DesignPatterns.structural.facadeDesignPattern.Menus.Menus;

public interface HotelKeeper {
	public Menus getVegMenus();
	
	public Menus getNonVegMenus();
	
	public Menus getVegNonVegBothMenus();
}
