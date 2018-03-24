/*
 *TimeCalculator.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 4, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14 & 15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Program to Compute the number of Hours, Minutes and Seconds
 * 
 * @author Saurabh Bansal
 *
 */
public class TimeCalculator
{

	public static void main(String[] args)
	{
		final int NUMBER_OF_SECONDS_HR = 3600;
		final int NUMBER_OF_SECONDS_MIN = 60;

		int timeRemaining = 0;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		Scanner enterNumberofSeconds = new Scanner(System.in);
		
		System.out.println("Enter total Number of Seconds ");
		int numberofSeconds = enterNumberofSeconds.nextInt();
		hours = numberofSeconds / NUMBER_OF_SECONDS_HR;
		timeRemaining = numberofSeconds - (hours * 3600);
		minutes = timeRemaining / NUMBER_OF_SECONDS_MIN;
		seconds = timeRemaining - (minutes * 60);
		System.out.println("Number of Seconds " + numberofSeconds);
		System.out.println("Hours " + hours);
		System.out.println("Minutes " + minutes);
		System.out.println("Seconds " + seconds);
		enterNumberofSeconds.close();

	}

}
