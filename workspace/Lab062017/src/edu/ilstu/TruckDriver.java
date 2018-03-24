/*
 *TruckDriver.java
 *Programmer: Saurabh Bansal
 *ULID : Sbansa1
 *Feb 17, 2017
 * 
 *Class: IT 168
 *Lecture Section: 1 & 7
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:2 & 8
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * Application class to execute the Truck class.
 * 
 * @author Saurabh Bansal
 *
 */
public class TruckDriver
{

	public static void main(String[] args)
	{

		// Call the default constructor
		Truck truck1 = new Truck();
		truck1.print();
		// Also acceptable:

		// Call constructor with 1 argument
		Truck truck2 = new Truck(6);
		truck2.print();

		// Call constructor with 2 arguments
		Truck truck3 = new Truck(6, "Ford");
		truck3.print();

		// Call constructor with 4 arguments
		Truck truck5 = new Truck(6, "Ford", 1000, 13000);
		truck5.print();
	}

}
