/*
 *PersonTester.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 20, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14 and 15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Application class to execute the person class.
 * 
 * @author Saurabh Bansal
 *
 */
public class PersonTester
{

	public static void main(String[] args)
	{
		String lastName = null;
		String firstName = null;
		int age = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter First Name for the First Person: ");
		firstName = keyboard.next();

		System.out.print("Last Name of the first Person: ");
		lastName = keyboard.next();

		System.out.print("Enter Age for the First Person :");
		age = keyboard.nextInt();
		Person person1 = new Person(firstName, lastName, age);
		System.out.println();
		System.out.print("Enter First Name for the Second Person: ");
		firstName = keyboard.next();

		System.out.print("Last Name of the Second Person : ");
		lastName = keyboard.next();

		System.out.print("Enter Age for the Second Person :");
		age = keyboard.nextInt();
		Person person2 = new Person(firstName, lastName, age);
		System.out.println();

		if (person1.equals(person2))
		{

			System.out.println(person1.toString() + " and");
			System.out.println(person2.toString());
			System.out.println("Have Same Name");
		}
		else
		{
			System.out.println(person1.toString() + " and ");
			System.out.println(person2.toString());
			System.out.println("Have Different Names");

			System.out.println();
		}

		if (person1.getAge() == person2.getAge())
		{
			System.out.println(person1.toString());
			System.out.println(person2.toString());
			System.out.println("have same age");
		}
		else if (person1.getAge() > person2.getAge())
		{
			System.out.println(person1.toString() + " is older ");
			System.out.println(person2.toString());

		}
		else
		{
			System.out.println(person1.toString() + " is younger ");
			System.out.println(person2.toString());

		}
		keyboard.close();
	}

}
