/*
 *GeographicAreaLookup.java
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

/**
 *Application which looks for the geographic Area in USA
 * 
 *@author Saurabh Bansal
 *
 */
public class GeographicAreaLookup
{

	public void determineAreaByZip(String zipcode){
		
		if(zipcode.substring(0,1).equals("3"))
		{
			System.out.println("East Coast"); 
		}
		else if (zipcode.substring(0,1).equals("4") || zipcode.substring(0,1).equals("5") || zipcode.substring(0,1).equals("6"))
		
	{
	    System.out.println("Central Plains");
	}
		else if(zipcode.substring(0,1).equals("7")){
		System.out.println("South");
		
	}
		else if (zipcode.substring(0,1).equals("8") || zipcode.substring(0,1).equals("9")){
		System.out.println("West");
	}
	else  {
		System.out.println("Ivalid ZipCode");
	}
	
	}
}
