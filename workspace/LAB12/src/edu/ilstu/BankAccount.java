/*
 *BankAccount.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Nov 2, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14-15
 *Lab Instructor:Saurabh Bansal
 */

package edu.ilstu;

/**
 * Handles processing for a bank account
 *
 * @author Cathy Holbrook
 * @author Modified by: Saurabh Bansal
 *
 */
public class BankAccount
{
	private String accountNumber;
	private String firstName;
	private String lastName;
	private double balance;
	private final double OVERDRAFT_CHARGE = 30.0;

	/**
	 * Constructor with arguments which is referencing the instance variables.
	 */
	public BankAccount(String accountNumber, String firstName, String lastName,
			double balance)
	{
		super();
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	/**
	 * 
	 * Gets the amount the customer wants to withdraw, checks to be sure they
	 * have enough in their balance for the amount, process the withdrawal or
	 * provide an insufficient funds message.
	 *
	 * @param: withdrawal
	 *
	 */
	public void processWithdrawal(double withdrawal)
	{
		boolean funds = validateWithdrawalAmount(withdrawal);

		if (funds && balance < withdrawal)
		{

			balance = (balance - withdrawal) + (-OVERDRAFT_CHARGE);
		}
		else if (balance >= withdrawal)
		{
			balance = (balance - withdrawal);
		}

	}

	/**
	 * 
	 * Validates whether there is enough money in the account for the amount the
	 * customer wants to withdraw.Even if the withdrawal amount is smaller than
	 * the remaining balance. Then an overdraft charge is added to the account.
	 *
	 * @param: withdrawal
	 * @return: Funds
	 *
	 */
	private boolean validateWithdrawalAmount(double withdrawal)
	{
		boolean funds = false;

		if (withdrawal >= balance)
		{
			return !funds;
		}

		return funds;
	}

	/**
	 * 
	 * Processes a deposit by adding the amount to the balance
	 *
	 * @param: deposit
	 *             - Deposit the funds in the account
	 *
	 */
	public void processDeposit(double deposit)
	{
		System.out.printf("\n$%.2f %s", deposit,
				" has been added to your account");
		balance = balance + deposit;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber()
	{
		return accountNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance()
	{
		return balance;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	@Override
	public String toString()
	{
		return accountNumber + "\n" + firstName + "\n" + lastName + "\n"
				+ balance;

	}

}
