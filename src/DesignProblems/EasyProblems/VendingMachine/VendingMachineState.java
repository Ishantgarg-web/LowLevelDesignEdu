package DesignProblems.EasyProblems.VendingMachine;

import java.util.HashMap;

public interface VendingMachineState {
	
	public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception;
	
	public void insertMoney(VendingMachine vendingMachine, HashMap<CurrencyDenomination, Integer> currencyDenomination) throws Exception;
	
	public void refundFullMoney(VendingMachine vendingMachine) throws Exception;
	
	public void pressProductSelectionButton(VendingMachine vendingMachine) throws Exception;
	
	public void chooseProduct(VendingMachine vendingMachine, int productCodeNumber) throws Exception;
	
	public void returnChange(VendingMachine vendingMachine,Product product);
	
	public void dispenseProduct(VendingMachine vendingMachine, int productCodeNumber);
	
	public void updateInventory(VendingMachine vendingMachine, Product product, int productCodeNumber);
}
