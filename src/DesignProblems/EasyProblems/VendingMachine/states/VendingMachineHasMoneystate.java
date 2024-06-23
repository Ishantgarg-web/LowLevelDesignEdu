package DesignProblems.EasyProblems.VendingMachine.states;

import java.util.HashMap;

import DesignProblems.EasyProblems.VendingMachine.CurrencyDenomination;
import DesignProblems.EasyProblems.VendingMachine.Product;
import DesignProblems.EasyProblems.VendingMachine.VendingMachine;
import DesignProblems.EasyProblems.VendingMachine.VendingMachineState;
import DesignProblems.EasyProblems.VendingMachine.utils.VendingMachineUtils;

public class VendingMachineHasMoneystate implements VendingMachineState{

	@Override
	public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You have already selected this button");
	}

	@Override
	public void insertMoney(VendingMachine vendingMachine,
			HashMap<CurrencyDenomination, Integer> currencyDenomination) {
		vendingMachine.setUserCurrencyDenomination(currencyDenomination);
		System.out.println("Your money is accepted by vending machine");
		vendingMachine.setVendingMachineState(new VendingMachineProductSelectionState());
	}

	@Override
	public void refundFullMoney(VendingMachine vendingMachine) {
		System.out.println("Please take your money: "+VendingMachineUtils.calculateTotalAmount(vendingMachine.getUserCurrencyDenomination()));
		vendingMachine.setUserCurrencyDenomination(null);
	}

	@Override
	public void pressProductSelectionButton(VendingMachine vendingMachine) {
		vendingMachine.setVendingMachineState(new VendingMachineProductSelectionState());
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int productCodeNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnChange(VendingMachine vendingMachine,Product product) {
		// TODO Auto-generated method stub
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
