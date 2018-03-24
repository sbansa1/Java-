/**
 * simple class to track the balance in a single account
 *
 * allows deposits and withdrawls
 */

package edu.ilstu;

public class BankAccount {

	private double balance;

	public BankAccount() {
		balance = 0;
	}

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "The balance is $" + balance;
	}

	public void makeDeposit(double amt) {
		this.balance = amt + balance;

		System.out.println("Your new balance is " + this.balance);
	}

	public void makeWithdrawl(double amt) {
		double newBalance = this.balance;
		// newBalance -= amt;

		if (newBalance > 0) {
			newBalance -= amt;

			this.balance = newBalance;
			System.out.println("Your new balance is " + this.balance);
		} else {
			System.out.println("Your account does not have " + amt);
			System.out.println("Your current balance is " + this.balance);

		}

	}

}
