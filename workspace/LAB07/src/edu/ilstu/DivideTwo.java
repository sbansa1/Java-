/*
 *DivideTwo.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 27, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14 and 15
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Program to compute the division by using if - else statement
 * 
 * @author Saurabh Bansal
 *
 */
public class DivideTwo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numerator = 0;
		int denominator = 0;
		double quotient = 0;

		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator:  ");
		numerator = keyboard.nextInt();

		System.out.print("Enter the denominator:  ");
		denominator = keyboard.nextInt();

		if (denominator == 0)
		{
			System.out.println("Division by Zero Not allowed");

		}

		else
		{
			quotient = (double) numerator / denominator;
			System.out
					.println(numerator + "/" + denominator + " = " + quotient);
		}

		keyboard.close();
	}
}
