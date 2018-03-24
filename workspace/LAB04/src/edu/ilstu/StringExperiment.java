/*
 *StringExperiment.java
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

/**
 * First Program using the String Class and its Methods.
 * 
 * @author Saurabh Bansal
 *
 */
public class StringExperiment
{

	public static void main(String[] args)
	{
		String firstName = "saurabh";
		String middleName = "subhash";
		String lastName = "bansal";
		int position = 0;
		int result = 0;
		String answer = null;

		System.out.println(firstName + " " + middleName + " " + lastName);
		System.out.println(
				firstName + " " + middleName.charAt(0) + "." + " " + lastName);
		System.out.println(
				firstName.toUpperCase() + " " + lastName.toLowerCase());
		System.out.println("Length of the Last name = " + lastName.length());

		if (lastName.length() % 2 == 0)
		{
			position = lastName.length() / 2;
			result = 1;
		}
		else if (lastName.length() % 2 != 0)
		{
			position = lastName.length() / 2;
			result = 1;
		}
		answer = lastName.substring(position, position + result);
		System.out.println("Middle letter is = " + answer);

		if (firstName.length() % 1 == 0)
		{
			position = firstName.length();
			position = position - 1;
			result = 1;
		}
		answer = firstName.substring(position, position + result);
		System.out.println("Last letter is = " + answer);
	}
}