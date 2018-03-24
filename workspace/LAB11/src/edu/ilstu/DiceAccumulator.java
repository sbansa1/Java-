/*
 *DiceAccumulator.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 26, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14 & 15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * The class has six instance variable and 12 methods which is counting number
 * of snake eyes ,fours,twos,fives etc we have encountered in the total rolls,
 * and have a getter for all the instance variables.
 * 
 * @author Saurabh Bansal
 *
 */
public class DiceAccumulator
{
	private int snakeEyes;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;

	/**
	 * Increment snake eyes by one
	 */
	public void addSnakeEyes()
	{
		snakeEyes++;

	}

	/**
	 * Increment twos by one every time we encounter two on both the face of
	 * dice.
	 */
	public void addTwos()
	{
		twos++;
	}

	/**
	 * Increment threes by one every time we encounter threes on both the face
	 * of dice.
	 */
	public void addThrees()
	{
		threes++;
	}

	/**
	 * Increment fours by one every time we encounter fours on both the face of
	 * dice.
	 */
	public void addFours()
	{
		fours++;
	}

	/**
	 * Increment fives by one every time we encounter fives on both the face of
	 * dice.
	 */
	public void addFives()
	{
		fives++;
	}

	/**
	 * Increment sixes by one every time we encounter sixes on both the face of
	 * dice.
	 */
	public void addSixes()
	{
		sixes++;
	}

	/**
	 * Getter method for the snake eyes variable
	 * 
	 * @return- it returns the value of the instance variable snake eyes.
	 */
	public int getSnakeEyes()
	{
		return snakeEyes;
	}

	/**
	 * Getter method for the twos variable
	 * 
	 * @return- it returns the value of the instance variable twos.
	 */
	public int getTwos()
	{
		return twos;
	}

	/**
	 * Getter method for the threes variable
	 * 
	 * @return- it returns the value of the instance variable threes.
	 */
	public int getThrees()
	{
		return threes;
	}

	/**
	 * Getter method for the fours variable
	 * 
	 * @return- it returns the value of the instance variable fours.
	 */
	public int getFours()
	{
		return fours;
	}

	/**
	 * Getter method for the fives variable
	 * 
	 * @return- it returns the value of the instance variable fives.
	 */
	public int getFives()
	{
		return fives;
	}

	/**
	 * Getter method for the sixes variable
	 * 
	 * @return- it returns the value of the instance variable sixes.
	 */
	public int getSixes()
	{
		return sixes;
	}

}
