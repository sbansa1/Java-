/*
 *RestaurantBillCalculator.java
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
 *Program to compute  the bill in a restaurant. 
 *@author Saurabh Bansal
 *
 */
public class RestaurantBillCalculator
{
	 

 public static void main(String[] args)
	{
	 final double  TIP = .15;
	 final double TAX_RATE = .075;
	 double mealCost = 45.75;
	 double tax = 0;
	 double totalAmount = 0;
	 double tipAmount = 0;
     tax = (TAX_RATE * mealCost);
     tipAmount = (TIP * mealCost);
     totalAmount = (mealCost + tax + tipAmount);
     System.out.println("Meal Cost:" + " $"+ mealCost);
     System.out.println("Tax:" + " $"+tax);
     System.out.println("Tip:" + " $"+tipAmount);
     System.out.println("TotalAmount:" +" $"+totalAmount);
     
	} 

}
