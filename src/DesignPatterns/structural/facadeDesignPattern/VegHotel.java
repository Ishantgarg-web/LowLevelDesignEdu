package DesignPatterns.structural.facadeDesignPattern;

import DesignPatterns.structural.facadeDesignPattern.Menus.Menus;
import DesignPatterns.structural.facadeDesignPattern.Menus.VegMenu;

public class VegHotel implements Hotel{

	@Override
	public Menus getMenus() {
		VegMenu vg = new VegMenu();
		vg.getMenu();
		return vg;
	}
	
}
