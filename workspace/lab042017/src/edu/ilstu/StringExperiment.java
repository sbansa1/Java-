/*
 *StringExperiment.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Feb 3, 2017
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:2 and 8
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * A String manipulation Program using different String Class method to Display
 * the firstName,Last name and the middle name initials.
 * 
 * @author Saurabh Bansal
 *
 */
public class StringExperiment
{
	public static void main(String[] args)
	{
		String firstName = "Saurabh";
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

		if (lastName.length() % 2 == 0 || lastName.length() != 0)
		{
			position = lastName.length() / 2;
			result = position + 1;
		}

		answer = lastName.substring(position, result);
		System.out.println("Middle letter is = " + answer);

		position = firstName.length();
		position = position - 1;
		result = position + 1;

		answer = firstName.substring(position, result);
		System.out.println("Last letter is = " + answer);
	}

}
