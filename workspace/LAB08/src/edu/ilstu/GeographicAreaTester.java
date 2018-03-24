/*
 *GeographicAreaTester.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 6, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14-15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

import java.util.Scanner;

/**
 *Tester Class to execute GeographicAreaLookup Class
 * 
 *@author Saurabh Bansal
 *
 */
public class GeographicAreaTester
{

	public static void main(String[] args)
	{
       GeographicAreaLookup area = new GeographicAreaLookup ();
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter Zipcode: ");
       
       area.determineAreaByZip(keyboard.nextLine());
       keyboard.close();
       }
	
      
       
	}


