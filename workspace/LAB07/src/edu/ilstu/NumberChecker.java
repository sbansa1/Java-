/*
 *NumberChecker.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 29, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14 & 15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Program to determine whether a number is positive, negative or Zero.
 * 
 * @author Saurabh Bansal
 *
 */
public class NumberChecker
{

	public static void main(String[] args)
	{
		int inputNumber = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter any  Number : ");
		inputNumber = keyboard.nextInt();

		if (inputNumber > 0)
		{
			System.out.println("Entered Number is Positive = " + inputNumber);
		}
		else if (inputNumber==0)
		{ 
	    
			System.out.println("Entered Number is  = " + inputNumber);
	    }

		else 
		{
			System.out.println("Entered Number is negative = " + inputNumber);
		}
		keyboard.close();
	}

}
