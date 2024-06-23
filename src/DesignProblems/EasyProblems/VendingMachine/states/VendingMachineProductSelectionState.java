package DesignProblems.EasyProblems.VendingMachine.states;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import DesignProblems.EasyProblems.VendingMachine.CurrencyDenomination;
import DesignProblems.EasyProblems.VendingMachine.Product;
import DesignProblems.EasyProblems.VendingMachine.VendingMachine;
import DesignProblems.EasyProblems.VendingMachine.VendingMachineState;
import DesignProblems.EasyProblems.VendingMachine.utils.VendingMachineUtils;

public class VendingMachineProductSelectionState implements VendingMachineState{

	@Override
	public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You can not press this button now");
	}

	@Override
	public void insertMoney(VendingMachine vendingMachine,
			HashMap<CurrencyDenomination, Integer> currencyDenomination) throws Exception {
		throw new Exception("You can not insert cash now");
	}

	@Override
	public void refundFullMoney(VendingMachine vendingMachine) {
		System.out.println("Please take your Full money back: "+VendingMachineUtils.calculateTotalAmount(vendingMachine.getUserCurrencyDenomination()));
		vendingMachine.setUserCurrencyDenomination(null);
	}

	@Override
	public void pressProductSelectionButton(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You already selected this button");
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int productCodeNumber) throws Exception {
		List<Product> products = vendingMachine.getProducts();
		for (Product product: products) {
			if(product.getProductCodeNumber() == productCodeNumber) {
				// it means, this is the product which user want to buy
				if(product.getPrice()<=VendingMachineUtils.calculateTotalAmount(vendingMachine.getUserCurrencyDenomination())) {
					// it means, user entered price>=price of the product.
					// User can buy this product.
					// do return change if any.
					this.returnChange(vendingMachine,product);
				}else {
					// user entered less price.
					// So, we will now refund full money of the user and make the VM idle state.
					System.out.println("You Entered Less money than the product price.");
					this.refundFullMoney(vendingMachine);
					vendingMachine.setVendingMachineState(new VendingMachineIdleState());
				}
				return;
			}
		}
		throw new Exception("Please Enter valid product Code Number");
	}

	@Override
	public void returnChange(VendingMachine vendingMachine,Product product) {
		// Here, First we will add userEnteredCurrency to the VM currency
		// and then return the currency to the user, according to the product price.
		this.addCurrencyDenomination(vendingMachine);
		vendingMachine.setUserChoosedProduct(product);
		if(product.getPrice() == VendingMachineUtils.calculateTotalAmount(vendingMachine.getUserCurrencyDenomination())) {
			System.out.println("You entered the exact money as per your product price");
			vendingMachine.setVendingMachineState(new VendingMachineDespenseProductState());
		}else {
			// now, we have to return the money to the user.
			System.out.println("You Entered more money than the product price, Here it is the extra money: "+(VendingMachineUtils.calculateTotalAmount(vendingMachine.getUserCurrencyDenomination()) - product.getPrice()));
			VendingMachineUtils.returnUserExtraMoney(vendingMachine, VendingMachineUtils.calculateTotalAmount(vendingMachine.getUserCurrencyDenomination()));
		}
		vendingMachine.setUserCurrencyDenomination(null);
		vendingMachine.setVendingMachineState(new VendingMachineDespenseProductState());
		vendingMachine.getVendingMachineState().dispenseProduct(vendingMachine, product.getProductCodeNumber());
	}

	private void addCurrencyDenomination(VendingMachine vendingMachine) {
		for (Map.Entry<CurrencyDenomination, Integer> userCurrencyDeno: vendingMachine.getUserCurrencyDenomination().entrySet()) {
			vendingMachine.getVendingMachineCurrencyDenomination().put(userCurrencyDeno.getKey(), userCurrencyDeno.getValue()+vendingMachine.getVendingMachineCurrencyDenomination().get(userCurrencyDeno.getKey()));
		}
		System.out.println("Now Vending Machine Balance is: "+VendingMachineUtils.calculateTotalAmount(vendingMachine.getVendingMachineCurrencyDenomination()));
	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine, int productCodeNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInventory(VendingMachine vendingMachine, Product product, int productCodeNumber) {
		// TODO Auto-generated method stub
		
	}

}
