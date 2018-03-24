/*
 *RoomDimension.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 20, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14 & 15
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;

/**
 * Class which gives the area of the room
 * 
 * @author Saurabh Bansal
 *
 */
public class RoomDimension
{
	private double length;
	private double width;

	/**
	 * Constructor which accepts Length and Width
	 * 
	 * @param length makes the length of the room
	 * @param width makes the width of the room
	 */
	public RoomDimension(double length, double width)
	{
		super();
		this.length = length;
		this.width = width;
	}

	/**
	 * A method which Calculates Area
	 * 
	 * @return the area of the room
	 */
	public double calculateArea()
	{
		return length * width;

	}

	@Override
	public String toString()
	{
		return "\nlength = " + length + "\nWidth = " + width + "\nArea =  "
				+ calculateArea();

	}

}
