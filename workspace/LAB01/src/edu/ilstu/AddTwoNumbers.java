/*
 * File name:AddTwoNumbers
 *
 * Programmer:Saurabh Bansal
 * ULID:819654128
 *
 * Date: Aug 20,2016
 *
 * Class: IT168
 * Lecture Section:
 * Lecture Instructor:Patricia Mastuda
 * Lab Section:
 * Lab Instructor:
 */

package edu.ilstu;

import java.util.Scanner;

/**
 * <Add two Numbers read from the keyboard>
 * 
 * @author Saurabh Bansal
 *
 */
public class AddTwoNumbers
{
	public static void main(String[] args)
	{
		int i;
		int l;
		Scanner number1 = new Scanner(System.in);
		i = number1.nextInt();
		Scanner number2 = new Scanner(System.in);
		l = number2.nextInt();

		System.out.println("Hello");
		System.out.println("I will add two numbers for you.");

		System.out.println("The first number is: " + i);
		System.out.println("The second number is: " + l);

		System.out.print("The sum of these two numbers is: ");
		System.out.println(i + l);

	}
}
