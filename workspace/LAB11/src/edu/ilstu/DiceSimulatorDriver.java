/*
 *DiceSimulatorDrivre.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 27, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14 & 15
 *Lab Instructor:Saurabh bansal
 */
package edu.ilstu;

/**
 * Application Class which has a Dice simulator object and Dice Accumulator
 * object and executed how many snakeyes, fours, twos we have in total out of
 * 10000.
 * 
 * @author Saurabh Bansal
 *
 */
public class DiceSimulatorDriver
{

	public static void main(String[] args)
	{
		final int numberSimulationRolls = 10000;
		DiceSimulator obj = new DiceSimulator();
		DiceAccumulator object = obj.runSimulation(numberSimulationRolls);
		System.out.println("Total Number of Rolls: " + numberSimulationRolls);
		System.out.println("Number Snake Eyes: " + object.getSnakeEyes());
		System.out.println("Number twos: " + object.getTwos());
		System.out.println("Number Threes: " + object.getThrees());
		System.out.println("Number Fours: " + object.getFours());
		System.out.println("Number fives: " + object.getFives());
		System.out.println("Number Sixs: " + object.getSixes());

	}
}