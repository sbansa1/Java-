/*
 * Filename:  SwitchErrors.java
 *
 * Programmer: Saurabh Bansal
 * ULID: 819654128
 *
 * Date: 10/06/2016
 *
 * Class: IT 168
 * Lecture Section:13
 * Lecture Instructor:Patricia Mastuda
 * Lab Section:14-15
 * Lab Instructor: Saurabh Bansal 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 *  Switch Errors Application
 *
 * @author Saurabh Bansal
 *
 */
public class SwitchErrors
{

	public static void main(String[] args)
	{
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.println("Key:  1=red, 2=blue, 3=green");
		 System.out.print("Enter a number and I'll return ");
		 System.out.print(" the corresponding color.  ");
		 
		 int number = keyboard.nextInt();
		 
		 switch(number)
		 {
			 case 1:
				 System.out.println("You chose red!");
				 break;
			 case 2:
				 System.out.println("You chose blue!");
				 break;
			 case 3:
				 System.out.println("You chose green!");
		     default:
		    	 System.out.println("Color not available!");
		    	 break;
		 } keyboard.close();
	}

}
