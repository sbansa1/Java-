/*
* File name: TimeCalculator.java
*
* Programmer: Paul von Ebers
* ULID: plvoneb
*
* Date: Feb 8, 2017
*
* Class: IT 168
* Lecture Section: 13
* Lecture Instructor: Dr. David Sikolia
* Lab Section: 15
* Lab Instructor: Saurabh Bansal
*/
package edu.ilstu;

import java.util.Scanner;

/**
* Converting seconds to hours, minutes, and remaining seconds
*
* @author Paul von Ebers
*
*/
public class AccountDriver
{

	
	public static void main(String[] args)
	{
		
		//	Variable for input.
		int userSec;
		
		//	Variables to store time
		int hours, minutes, seconds;
		
		//	Constants for seconds in hours/minutes
		final int SEC_IN_HOUR = 3600;
		final int SEC_IN_MIN = 60;
		
		//	Keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		//	get seconds from user
		System.out.print("How many seconds?: ");
		userSec = keyboard.nextInt();
		
		//	Get hours 
		hours = userSec / SEC_IN_HOUR;
		userSec = userSec - (hours * SEC_IN_HOUR);
		
		//	Get minutes 
		minutes = userSec / SEC_IN_MIN;
		userSec = userSec - (minutes * SEC_IN_MIN);
		
		//	Get remaining seconds
		seconds = userSec;
		
		//	Output values
		System.out.println("There are " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
		
		
		

	}

}
