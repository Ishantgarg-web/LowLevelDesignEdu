package DesignProblems.EasyProblems.VendingMachine.utils;

import java.util.HashMap;
import java.util.Map;

import DesignProblems.EasyProblems.VendingMachine.CurrencyDenomination;
import DesignProblems.EasyProblems.VendingMachine.VendingMachine;

public class VendingMachineUtils {
	
	public static int calculateTotalAmount(HashMap<CurrencyDenomination, Integer> currencyDenomination) {
		if(currencyDenomination == null) {
			return 0;
		}
		int totalAmount = 0;
		for (Map.Entry<CurrencyDenomination, Integer> entry: currencyDenomination.entrySet()) {
			if(entry.getKey().equals(CurrencyDenomination.Coin_1_Ruppee)) {
				totalAmount+=1*entry.getValue();
			}else if(entry.getKey().equals(CurrencyDenomination.Coin_2_Ruppee)) {
				totalAmount+=2*entry.getValue();
			}else if(entry.getKey().equals(CurrencyDenomination.Con_5_Ruppee)) {
				totalAmount+=5*entry.getValue();
			}else if(entry.getKey().equals(CurrencyDenomination.Note_10_Ruppee)) {
				totalAmount+=10*entry.getValue();
			}else if(entry.getKey().equals(CurrencyDenomination.Note_20_Ruppee)) {
				totalAmount+=20*entry.getValue();
			}else if(entry.getKey().equals(CurrencyDenomination.Note_50_Ruppee)) {
				totalAmount+=50*entry.getValue();
			}else {
				totalAmount+=100*entry.getValue();
			}
		}
		return totalAmount;
	}

	public static void returnUserExtraMoney(VendingMachine vendingMachine, int returnAmount) {
		// We can make Despenser here.
		
	}
	
}
