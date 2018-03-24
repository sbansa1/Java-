/*
 *ArithmeticEquations.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Aug 29, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:
 *Lab Instructor:
 */
package edu.ilstu;

/**
 *Write and test arithmetic expressions
 * 
 *@author Saurabh Bansal
 *
 */
public class ArithmeticEquations
{

	
	public static void main(String[] args)
	{
		final int FREEZING = 32;
		double height = 9.0;
		double base1 = 5.0;
		double base2 = 10.0;
		int farenheit = 78;
		int expected = 89;
		int observed = 78;
		double area = 0;
		double celcius = 0;
		double percentageOfdiffernce = 0; 
		
		// Problem 17
		area = (height/2) * (base1+base2);
		System.out.println("area of trapezium " + area);
		
		// Problem 18
		celcius = (double)(farenheit - FREEZING) * 5.0/9.0;
		System.out.println("Temperature in Celcius " + celcius);
		
				
		// Problem 19
		percentageOfdiffernce = (double)(expected - observed)/(expected) * 100.0;
		System.out.println("Percentage of Difference " + percentageOfdiffernce);
		
				

	}

}
