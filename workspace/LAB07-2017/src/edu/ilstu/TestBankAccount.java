package edu.ilstu;

public class TestBankAccount 
{

	/**
	 * testing the simple BankAccount class
	 */
	public static void main(String[] args) {
		
		
		BankAccount startZero = new BankAccount();
		BankAccount start100 = new BankAccount(100);
		
		System.out.println(startZero);
		
		// why is this balance zero?
		System.out.println("Bank account with starting balance of 100: " + start100);
		
		// why do none of these statements work??
		startZero.makeDeposit(25); // should work, balance = 25
		startZero.makeDeposit(75); // should work, balance = 100
		startZero.makeWithdrawl(25.50); // should work, balance = 74.50
		startZero.makeWithdrawl(74.50); // should work, balance = 0
		startZero.makeWithdrawl(10); // should not work, why?
	}

}
