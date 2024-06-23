package DesignProblems.EasyProblems.VendingMachine.states;

import java.util.HashMap;

import DesignProblems.EasyProblems.VendingMachine.CurrencyDenomination;
import DesignProblems.EasyProblems.VendingMachine.Product;
import DesignProblems.EasyProblems.VendingMachine.VendingMachine;
import DesignProblems.EasyProblems.VendingMachine.VendingMachineState;

public class VendingMachineDespenseProductState implements VendingMachineState{

	@Override
	public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You can press insert cash button here");
	}

	@Override
	public void insertMoney(VendingMachine vendingMachine,
			HashMap<CurrencyDenomination, Integer> currencyDenomination) throws Exception {
		throw new Exception("You can not insert money here");
	}

	@Override
	public void refundFullMoney(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You can not ask for full money refund here");
	}

	@Override
	public void pressProductSelectionButton(VendingMachine vendingMachine) {
		// TODO Auto-generated method stub
		
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
		System.out.println("Please take your requested product: "+vendingMachine.getUserChoosedProduct());
		vendingMachine.setVendingMachineState(new VendingMachineIdleState());
	}

	@Override
	public void updateInventory(VendingMachine vendingMachine, Product product, int productCodeNumber) {
		// TODO Auto-generated method stub
		
	}

}
