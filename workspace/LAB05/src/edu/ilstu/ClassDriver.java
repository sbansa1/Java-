/*
 *ClassDriver.java
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
 * Application Class to display to the area, diameter and circumference of a circle
 * 
 * @author Saurabh Bansal
 *
 */
public class ClassDriver
{

	public static void main(String[] args)
	{
		Circle c = new Circle();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the Radius of Circle : ");
		c.setRadius(keyboard.nextDouble());
		System.out.println("Area = " + c.calculateArea());
		System.out.println("Diameter = " + c.calculateDiameter());
		System.out.println("Circumference = " + c.calculateCircumference());
		keyboard.close();

	}

}
