package DesignProblems.EasyProblems.VendingMachine.states;

import java.util.HashMap;

import DesignProblems.EasyProblems.VendingMachine.CurrencyDenomination;
import DesignProblems.EasyProblems.VendingMachine.Product;
import DesignProblems.EasyProblems.VendingMachine.VendingMachine;
import DesignProblems.EasyProblems.VendingMachine.VendingMachineState;

public class VendingMachineIdleState implements VendingMachineState{
	
	@Override
	public void pressInsertCashButton(VendingMachine vendingMachine) {
		vendingMachine.setVendingMachineState(new VendingMachineHasMoneystate());
	}

	@Override
	public void insertMoney(VendingMachine vendingMachine,
			HashMap<CurrencyDenomination, Integer> currencyDenomination) throws Exception {
		throw new Exception("You can insert coin in idle state");
	}

	@Override
	public void refundFullMoney(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You can not ask for refund money in idle state");
	}

	@Override
	public void pressProductSelectionButton(VendingMachine vendingMachine) throws Exception {
		throw new Exception("you can not press select product button in idle state");
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int productCodeNumber) throws Exception {
		throw new Exception("You can not choose product in idle state");
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
