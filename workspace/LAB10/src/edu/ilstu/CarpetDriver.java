/*
 *CarpetDriver.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 20, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14 & 15.
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Application Class to Execute Room Dimension and Room Carpet
 * 
 * @author Saurabh Bansal
 *
 */
public class CarpetDriver
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
			
		

		System.out.print("Enter the length : ");
		double length = keyboard.nextDouble();

		System.out.print("Enter the Width : ");
		double width = keyboard.nextDouble();
		RoomDimension roomArea = new RoomDimension(length, width);


		System.out.println();
		System.out.print("Enter the Cost of Carpet : ");
		RoomCarpet carpetCost = new RoomCarpet(roomArea, keyboard.nextDouble());
		System.out.println(carpetCost.toString());
		System.out.println("Total Price for Carpeting a room = " + nf.format(carpetCost.calculateTotalCost()));
		keyboard.close();

	}

}
