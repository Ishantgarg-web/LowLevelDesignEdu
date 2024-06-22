package DesignPatterns.structural.facadeDesignPattern;

/**
 * 
 * @author ishant
 * FacadeDesignPattern:
 * its main responsibility is to hide all the inner complexities of the code and provide simple interface
 * to the client.
 * 
 * Example:
 * There is a ABC Hotel and in this hotel, there are many hotels(like veg, non-veg, both)
 * and if you are customer of this ABC hotel, but you want veg menu, some other customer want
 * non-veg and so on.
 * for solving their queries, their is a HotelKeeper, that will provide the menu for the hotel to the
 * customer, so he is behaving like a Facade pattern, he hides all the inner complexities for the customer.
 */


public class Main {
	public static void main(String[] args) {
		// We as a customer calling the HotelKeeperImpl for getting different hotels menus.
		HotelKeeper hi = new HotelKeeperImplementation();
		hi.getVegMenus();
		hi.getNonVegMenus();
		hi.getVegNonVegBothMenus();
	}
}
