package DesignPatterns.structural.facadeDesignPattern;

import DesignPatterns.structural.facadeDesignPattern.Menus.Menus;

public class HotelKeeperImplementation implements HotelKeeper{

	@Override
	public Menus getVegMenus() {
		Hotel vh = new VegHotel();
		return vh.getMenus();
	}

	@Override
	public Menus getNonVegMenus() {
		Hotel vh = new NonVegHotel();
		return vh.getMenus();
	}

	@Override
	public Menus getVegNonVegBothMenus() {
		Hotel vh = new BothHotel();
		return vh.getMenus();
	}

	
	
}
