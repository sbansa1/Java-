/*
 *BookDriver.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 12, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14 & 15
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;


import java.util.Scanner;

/**
 * Application Class to execute the Book class.
 * 
 * @author Saurabh Bansal
 *
 */
public class BookDriver
{

	public static void main(String[] args)
	{

		Book b1 = new Book();
		Book b2 = new Book();
		int quantity = 0;
		int quantity2 = 0;
		double percentage_increase = 0;
		double percentage_increase1 = 0;

		Scanner keyboard = new Scanner(System.in);
		b1.setPrice(19.99);
		b1.setTitle("Life Of PI");
		b2.setPrice(28.50);
		b1.setTitle("Harry Potter Goblet Of Fire ");

		System.out.print("Enter number to buy Life of Pi: ");
		quantity = keyboard.nextInt();
		System.out.printf("Original cost for Life of Pi =" + " " + "$%.2f\n",
				(b1.getPrice()));
		System.out.print(
				"Enter Percentage Increase for Life of Pi (in decimal format) : ");
		percentage_increase = keyboard.nextDouble();

		System.out.printf("Cost of Life of Pi = " + "$%.2f\n",
				(b1.increasePrice(percentage_increase)));

		System.out.printf("Original Cost for Harry Potter = " + "$%.2f\n",
				(b2.getPrice()));
		System.out.print("Enter number to buy Goblet of fire: ");
		quantity2 = keyboard.nextInt();
		System.out.print(
				"Enter Percentage Increase for Harry Potter (in decimal Format) : ");
		percentage_increase1 = keyboard.nextDouble();

		System.out.printf("Cost of Harry Potter = " + "$%.2f\n",
				(b2.increasePrice(percentage_increase1)));

		System.out.printf("Cost for Life of Pi after tax = " + "$%.2f\n",
				(b1.calculateSales(quantity)));

		System.out.printf("Cost for Harry Potter after tax = " + "$%.2f\n",
				(b2.calculateSales(quantity2)));
    keyboard.close();
	}

}
