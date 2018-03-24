/*
 *ArrayUtility.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Nov 10, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14-15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * This Class Portrays the Different Flavors of Array.
 * 
 * @author Saurabh Bansal
 *
 */
public class ArrayUtility
{

	/**
	 * @param intArray
	 *            - An array of integer type where the default value is 0 we
	 *            loop through the elements greater than 20 and as we loop
	 *            through the counter increases by 1 depending on the element
	 *            and we find the percentage based on that.
	 * @return the percentage calculated by diving the length of array.
	 */
	public double findPercentageGreaterThanTwenty(int[] intArray)
	{
		int counter = 0;
		double percentage = 0;
		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] > 20)
			{
				counter++;
			}
			percentage = (double) counter / intArray.length;

		}

		return percentage;
	}

	/**
	 * @param intArray
	 *            - integer type array which loops through the array to find the
	 *            smallest value
	 * @return the smallest value in the array.
	 */
	public int findSmallestInt(int[] intArray)
	{
		int smallest = intArray[0];
		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] < smallest)
			{
				smallest = intArray[i];
			}
		}
		System.out.println("Smallest Number : " + smallest);
		return smallest;

	}

	/**
	 * @param intArray
	 *            - Loops through the array of int type to find the largest
	 *            value
	 * @return the largest value at a particular index.
	 */
	public int findLargestInt(int[] intArray)
	{
		int largest = intArray[0];
		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] > largest)
			{
				largest = intArray[i];
			}
		}
		System.out.println("Largest Number: " + largest);
		return largest;
	}

	/**
	 * @param intArray
	 *            uses the index of arrays by figuring out what's the largest
	 *            and smallest value and calculates the difference based on that
	 * @return the difference between the largest and the smallest value.
	 */
	public int findDifferenceLargestSmallest(int[] intArray)
	{
		int difference = findLargestInt(intArray) - findSmallestInt(intArray);
		return difference;
	}

	/**
	 * @param intArray
	 *            - prints the array in reverse order by initializing i to
	 *            array.length and we deduct it by 1 so that it does not go out
	 *            of bounds as the index starts at 0.
	 * 
	 */
	public void printReverseOrder(int[] intArray)
	{
		for (int i = intArray.length - 1; i >= 0; i--)
		{
			System.out.println("intArray[" + i + "] " + intArray[i]);
		}

	}

	/**
	 * @param intArray
	 *            - it increases the value of elements of array by 4 by looping
	 *            through the Array and stores the new value
	 */
	public void increaseValues(int[] intArray)
	{

		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] = intArray[i] * 4;
		}

	}

}
