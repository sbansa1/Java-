/*
 *TruckDriver.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 22, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:
 *Lab Instructor:
 */
package edu.ilstu;

/**
 *<insert class description here>
 * 
 *@author Saurabh Bansal
 *
 */
public class TruckDriver
{

	
	public static void main(String[] args)
	{
		//Call the default constructor
				Truck truck1 = new Truck();
				System.out.println(truck1.toString());
				//Also acceptable:
				//System.out.printlntruck1);
				
				//Call constructor with 1 argument
				Truck truck2 = new Truck(6);
				System.out.println(truck2.toString());
				
				//Call constructor with 2 arguments
				Truck truck3 = new Truck(6, "Ford");
				System.out.println(truck3.toString());
				
				//Call constructor with 3 arguments
				Truck truck4 = new Truck(6, "Ford", 1000);
				System.out.println(truck4.toString());
				
				//Call constructor with 4 arguments
				Truck truck5 = new Truck(6, "Ford", 1000, 13000);
				System.out.println(truck5.toString());
			}

		


	}


