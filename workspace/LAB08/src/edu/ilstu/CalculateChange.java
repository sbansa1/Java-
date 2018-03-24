/*
 *CalculateChange.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 6, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14-15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

import java.util.Scanner;


/**
 * it is a program to calculate change.
 * 
 *@author Saurabh Bansal
 *
 */
public class CalculateChange
{

	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int amount = 0; 
		int originalAmount = 0;
        int quarters = 0; 
        int dimes = 0; 
        int nickels = 0;
        
    
     System.out.println("Enter a whole number in multiples of 5 from 25 to 100.");
     Scanner keyboard = new Scanner(System.in);
     amount = keyboard.nextInt();
     
     if(amount%5 == 0 && amount >= 25 && amount <=100){
    System.out.println("Entered Amount is Valid : " + amount);
    		 }
 
     else 
     {
    	 System.out.println("Invalid Amount " + amount);
     }
     originalAmount = amount;
     amount = 100 - originalAmount;
     quarters = amount / 25;
     amount = amount % 25;
     dimes = amount / 10;
     amount = amount % 10;
     nickels = amount / 5;
     amount = amount % 5;
     
     
     if(quarters == 1){
    	 System.out.println("Quarter :" + quarters );
    	 
     }else if (quarters > 1){
    	 System.out.println("Quarters: " + quarters);
     }
       if(dimes == 1){
    	   System.out.println("Dime : " + dimes );
       }
       else if (dimes>1){
    	   System.out.println("Dimes : " + dimes);
       }
      if(nickels == 1){
    	  System.out.println("Nickle : " + nickels);
      }
      else if(nickels > 1){
    	  System.out.println("Nickles : " + nickels);
      }
      keyboard.close();
	}

}
