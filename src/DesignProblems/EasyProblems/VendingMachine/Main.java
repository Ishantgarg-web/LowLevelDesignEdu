package DesignProblems.EasyProblems.VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author ishant
 * We will be using State Transition Diagram.
 * State Transition Diagram is used for transition between states. Here Different state
 * like idle, HasMoney, ProductSelection, DispenseProduct states can implement
 * different functions for use.
 * 
 * see VendingMachineStateFlow.png for diagram
 */


public class Main {
	public static void main(String[] args) throws Exception {
		
		HashMap<CurrencyDenomination, Integer> vendingMachineCurrencyDeno = new HashMap<>();
		vendingMachineCurrencyDeno.put(CurrencyDenomination.Coin_1_Ruppee, 10);
		vendingMachineCurrencyDeno.put(CurrencyDenomination.Coin_2_Ruppee, 10);
		vendingMachineCurrencyDeno.put(CurrencyDenomination.Con_5_Ruppee, 10);
		vendingMachineCurrencyDeno.put(CurrencyDenomination.Note_10_Ruppee, 10);
		vendingMachineCurrencyDeno.put(CurrencyDenomination.Note_20_Ruppee, 10);
		vendingMachineCurrencyDeno.put(CurrencyDenomination.Note_50_Ruppee, 10);
		vendingMachineCurrencyDeno.put(CurrencyDenomination.Note_100_Ruppee, 10);
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(101, "Coke101", 10, 5));
		products.add(new Product(102, "Coke102", 5, 5));
		products.add(new Product(103, "Coke103", 20, 5));
		products.add(new Product(104, "Coke104", 25, 5));
		
		HashMap<CurrencyDenomination, Integer> userCurrencyDeno = new HashMap<>();
		userCurrencyDeno.put(CurrencyDenomination.Coin_1_Ruppee, 1);
		userCurrencyDeno.put(CurrencyDenomination.Coin_2_Ruppee, 0);
		userCurrencyDeno.put(CurrencyDenomination.Con_5_Ruppee, 0);
		
		VendingMachine vendingMachine = new VendingMachine(vendingMachineCurrencyDeno, products);
		vendingMachine.getVendingMachineBalance();
		vendingMachine.pressInsertCashButton(vendingMachine);
		vendingMachine.insertCurrencyDenomination(vendingMachine, userCurrencyDeno);
		vendingMachine.selectProduct(vendingMachine, 104);
	}
}
