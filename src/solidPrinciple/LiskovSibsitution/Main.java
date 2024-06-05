package solidPrinciple.LiskovSibsitution;

/**
 * 
 * @author ishant
 * This is the third principle of SOLID Principles.
 * it states that Derived or child classes must be substitutable for their base or parent classes.
 * Lets say if there is a function in ParentClass, so, there must be functionality define for that
 * in child class and it should work properly.
 * 
 * Example:
 * class MeunItem{
 * 	getPrice()
 * }
 * class BItem extends MenuItem{
 * 	getPriceWithDiscount(){
 * }
 * 
 * Here, BItem is-a MenuItem but giving some discount. So, client needs to add some more functionality
 * in BItem to deal with getPriceWithDiscount(), and for MenuItem seperately so, it is violating the
 * principle.
 * 
 * So, to correct this,
 * we can make a seperate function in MenuItem(), that is getPrice and that is internally calling getDiscount() function.
 */


public class Main {
	public static void main(String[] args) {
		MenuItem mi = new BeverageItem("water", 100);
		System.out.println(mi.getPrice());
		
		MenuItem ni = new NormalItem("water", 100);
		System.out.println(ni.getPrice());
	}
}
