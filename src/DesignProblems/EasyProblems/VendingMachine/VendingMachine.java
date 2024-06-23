package DesignProblems.EasyProblems.VendingMachine;

import java.util.HashMap;
import java.util.List;

import DesignProblems.EasyProblems.VendingMachine.states.VendingMachineIdleState;
import DesignProblems.EasyProblems.VendingMachine.utils.VendingMachineUtils;

public class VendingMachine {
	private VendingMachineState vendingMachineState;
	private HashMap<CurrencyDenomination, Integer> vendingMachineCurrencyDenomination;
	private HashMap<CurrencyDenomination, Integer> userCurrencyDenomination;
	private List<Product> products;
	private Product userChoosedProduct;
	
	public VendingMachineState getVendingMachineState() {
		return vendingMachineState;
	}
	public void setVendingMachineState(VendingMachineState vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}
	public HashMap<CurrencyDenomination, Integer> getVendingMachineCurrencyDenomination() {
		return vendingMachineCurrencyDenomination;
	}
	public void setVendingMachineCurrencyDenomination(
			HashMap<CurrencyDenomination, Integer> vendingMachineCurrencyDenomination) {
		this.vendingMachineCurrencyDenomination = vendingMachineCurrencyDenomination;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public HashMap<CurrencyDenomination, Integer> getUserCurrencyDenomination() {
		return userCurrencyDenomination;
	}
	public void setUserCurrencyDenomination(HashMap<CurrencyDenomination, Integer> userCurrencyDenomination) {
		this.userCurrencyDenomination = userCurrencyDenomination;
	}
	public VendingMachine(HashMap<CurrencyDenomination, Integer> vendingMachineCurrencyDenomination,
			List<Product> products) {
		super();
		this.vendingMachineState = new VendingMachineIdleState();
		this.vendingMachineCurrencyDenomination = vendingMachineCurrencyDenomination;
		this.userCurrencyDenomination = null;
		this.products = products;
		this.userChoosedProduct = null;
	}
	public Product getUserChoosedProduct() {
		return userChoosedProduct;
	}
	public void setUserChoosedProduct(Product userChoosedProduct) {
		this.userChoosedProduct = userChoosedProduct;
	}
	@Override
	public String toString() {
		return "VendingMachine [vendingMachineState=" + vendingMachineState + ", vendingMachineCurrencyDenomination="
				+ vendingMachineCurrencyDenomination + ", userCurrencyDenomination=" + userCurrencyDenomination
				+ ", products=" + products + ", userChoosedProduct=" + userChoosedProduct + "]";
	}
	
	public void selectProduct(VendingMachine vendingMachine, int produceCodeNumber) throws Exception {
		vendingMachine.getVendingMachineState().chooseProduct(vendingMachine, produceCodeNumber);
	}
	
	public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception {
		vendingMachine.getVendingMachineState().pressInsertCashButton(vendingMachine);
	}
	
	public void pressSelectProductButton(VendingMachine vendingMachine) throws Exception {
		vendingMachine.getVendingMachineState().pressProductSelectionButton(vendingMachine);
	}
	
	public void insertCurrencyDenomination(VendingMachine vendingMachine, HashMap<CurrencyDenomination, Integer> userCurrencyDeno) throws Exception {
		vendingMachine.getVendingMachineState().insertMoney(vendingMachine, userCurrencyDeno);
	}
	
	public void getVendingMachineBalance() {
		System.out.println("Balance is: "+VendingMachineUtils.calculateTotalAmount(vendingMachineCurrencyDenomination));
	}
	
}
