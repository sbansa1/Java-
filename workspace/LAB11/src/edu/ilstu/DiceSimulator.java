/*
 *DiceSimulator.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 27, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:13 & 14
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * Dice simulator Class which has a dice accumulator object and two die object
 * it validates that the number of rolls should be greater than 0 and calls in
 * the method roll from the die class by creating its object and compares the
 * spots on each roll.
 * 
 * @author Saurabh Bansal
 *
 */
public class DiceSimulator
{

	/**
	 * This method contains two objects of die and one object of Dice
	 * accumulator which compares whether two roll are similar on not. if they
	 * are similar then it count how many times we had encountered snake eyes.
	 * 
	 * @param numberRolls
	 *            - number of rolls we want to throw the dice.
	 * @return it returns the number of rolls for a particular value
	 */
	public DiceAccumulator runSimulation(int numberRolls)
	{
		DiceAccumulator countRolls = new DiceAccumulator();
		Die roll1 = new Die();
		Die roll2 = new Die();

		while (numberRolls > 0)
		{
			roll1.roll();
			roll2.roll();
			if (roll1.getSpots() == 1 && roll2.getSpots() == 1)
			{
				countRolls.addSnakeEyes();

			}
			else if (roll1.getSpots() == 2 && roll2.getSpots() == 2)
			{
				countRolls.addTwos();
			}
			else if (roll1.getSpots() == 3 && roll2.getSpots() == 3)
			{
				countRolls.addThrees();
			}
			else if (roll1.getSpots() == 4 && roll2.getSpots() == 4)
			{
				countRolls.addFours();
			}
			else if (roll1.getSpots() == 5 && roll2.getSpots() == 5)
			{
				countRolls.addFives();
			}
			else if (roll1.getSpots() == 6 && roll2.getSpots() == 6)
			{
				countRolls.addSixes();
			}

			numberRolls--;

		}
		return countRolls;

	}
}