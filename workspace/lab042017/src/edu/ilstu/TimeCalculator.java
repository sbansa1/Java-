/*
 *TimeCalculator.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Feb 3, 2017
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 2 and 8
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

import java.util.Scanner;

/**
 *A Program to Calculate the Number
 *of hours, minutes and seconds in N 
 *Number of Seconds.
 * 
 *@author Saurabh Bansal
 *
 */
public class TimeCalculator
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_SECONDS_HOUR = 3600;
		final int NUMBER_OF_SECONDS_MINUTES = 60;

		int timeRemaining = 0;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		Scanner enterNumberofSeconds = new Scanner(System.in);

		System.out.println("Enter total Number of Seconds ");
		int numberofSeconds = enterNumberofSeconds.nextInt();
		hours = numberofSeconds / NUMBER_OF_SECONDS_HOUR;
		timeRemaining = numberofSeconds - (hours * NUMBER_OF_SECONDS_HOUR);
		minutes = timeRemaining / NUMBER_OF_SECONDS_MINUTES;
		timeRemaining = timeRemaining - (minutes * NUMBER_OF_SECONDS_MINUTES);
		seconds = timeRemaining;
		System.out.println("Number of Seconds :" + numberofSeconds);
		System.out.println("Hours :" + hours);
		System.out.println("Minutes : " + minutes);
		System.out.println("Seconds: " + seconds);
		enterNumberofSeconds.close();

	}
}