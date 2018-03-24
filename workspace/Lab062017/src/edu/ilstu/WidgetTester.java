/*
 *WidgetTester.java
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

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Driver Class for executing Widget producer
 * 
 * @author Saurabh Bansal
 *
 */
public class WidgetTester
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");

		System.out.print(
				"Enter the number of Widgets to be Produced in an hour :");
		WidgetProducer w1 = new WidgetProducer(keyboard.nextInt());

		System.out.print("Total Number of Widgets to be produced :");
		int totalNumberofWidgets = keyboard.nextInt();

		System.out.println("Days to Produce : "
				+ df.format(w1.days(totalNumberofWidgets)) + " Days");

		System.out.println();

		System.out.print(
				"Enter the number of Widgets to be Produced in an hour :");

		WidgetProducer w2 = new WidgetProducer(keyboard.nextInt());

		System.out.print("Total Number of Widgets to be produced :");

		int totalNumberofWidgets1 = keyboard.nextInt();

		System.out.println("Days to Produce : "
				+ df.format(w2.days(totalNumberofWidgets1)) + " Days");

		System.out.println();

		System.out.print(
				"Enter the number of Widgets to be Produced in an hour :");

		WidgetProducer w3 = new WidgetProducer(keyboard.nextInt());

		System.out.print("Total Number of Widgets to be produced :");

		int totalNumberofWidgets2 = keyboard.nextInt();

		System.out.println("Days to Produce : "
				+ df.format(w3.days(totalNumberofWidgets2)) + " Days");

		keyboard.close();
	}

}
