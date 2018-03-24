/*
 *BankDriver.java
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Application Class for the BankAccount which reads from the file and outputs
 * the balance. Also writes the output to the file.
 * 
 * @author Saurabh Bansal
 *
 */
public class BankDriver
{

	public static void main(String[] args)
	{

		Scanner input = null;
		File file = null;
		PrintWriter out = null;
		String line = null;
		final String FILE_NAME = "Transactions.txt";
		String[] arr = new String[13];
		FileWriter file2 = null;
		final String FILE_RECORD = "AccountRecord.txt";

		try
		{
			file = new File(FILE_NAME);
			input = new Scanner(file);

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		while (input.hasNextLine())

		{
			for (int i = 0; i < arr.length; i++)
			{
				line = input.nextLine();
				arr[i] = line;
			}

		}

		String account_number = arr[0];
		String firstName = arr[1];
		String lastName = arr[2];
		String[] array = new String[2];
		Double balance = Double.parseDouble(arr[3]);

		BankAccount ba = new BankAccount(account_number, firstName, lastName,
				balance);
		for (int a = 4; a < arr.length; a++)
		{
			array = arr[a].split(" ");
			if (array[0].equals("1"))
			{
				ba.processWithdrawal(Double.parseDouble(array[1]));
			}
			else
			{
				ba.processDeposit(Double.parseDouble(array[1]));
			}
			System.out.println(ba.toString());
		}
		try
		{
			file2 = new FileWriter(FILE_RECORD);
			out = new PrintWriter(file2);
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
		out.println(ba.toString());
		out.close();
		System.out.println(ba.toString());
	}
}
