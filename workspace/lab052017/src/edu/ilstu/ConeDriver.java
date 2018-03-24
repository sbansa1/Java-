/*
 *ConeDriver.java
 *Programmer: Saurabh Bansal
 *ULID : Sbansa1
 *Feb 9, 2017
 * 
 *Class: IT 168
 *Lecture Section: 1 & 7
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 2 & 8
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Application Class to calculate area, volume and slant height of the cone.
 * 
 * @author Saurabh Bansal
 *
 */
public class ConeDriver
{

	public static void main(String[] args)
	{

		Cone c = new Cone();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		c.setRadius(keyboard.nextDouble());
		System.out.print("Enter the Height : ");

		c.setHeight(keyboard.nextDouble());
		System.out.println("Volume = " + c.calculateVolume());
		System.out.println("Slant Height = " + c.calculateSlantHeight());
		System.out.println("Surface Area = " + c.calculateBaseSurfaceArea());
		keyboard.close();
	}

}
