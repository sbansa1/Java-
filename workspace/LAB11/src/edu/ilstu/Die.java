/*
 *Die.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 26, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:13 & 14
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

import java.util.Random;

/**
 * This is a die class which generates random number starting from 1 to 6.
 * 
 * @author Saurabh Bansal
 *
 */
public class Die
{
	private int spots;
	private Random generator;

	/**
	 * This is a constructor which initializes the the instance variable and
	 * also makes an object of the generator.
	 */
	public Die()
	{
		super();
		this.generator = new Random();
	}

	/**
	 * This is a roll method of void type which assings the random number from 1
	 * to 6 to the spots instance variable.
	 */
	public void roll()
	{
		spots = generator.nextInt(6) + 1;

	}

	/**
	 * This method is a getter for spots which has a return type of int
	 * 
	 * @return spots
	 */
	public int getSpots()
	{
		return spots;

	}

	/**
	 * This method compares whether the two dice have the same roll if its true
	 * then it will return true else it will return false.
	 * 
	 * @param other-it
	 *            creates an object of class type which compares the two
	 *            instance variables of die if they have the same values or not.
	 * @return- boolean values depending on the case
	 */
	public boolean equals(Die other)
	{
		if (this.spots == (other.getSpots()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
