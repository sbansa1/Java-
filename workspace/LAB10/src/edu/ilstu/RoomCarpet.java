/*
 *RoomCarpet.java
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
 * Class which calculates the amount depending on the area.
 * 
 * @author Saurabh Bansal
 *
 */
public class RoomCarpet
{
	private RoomDimension dimensions;
	private double carpetPricePerSqFoot;

	/**
	 * Constructor with a class type parameter and instance variable.
	 * 
	 * @param dimensions its is a class type which gives the dimension of the room
	 * @param carpetPricePerSqfoot it takes the price per square foot of the room
	 */
	public RoomCarpet(RoomDimension dimensions, double carpetPricePerSqFoot)
	{

		super();
		this.dimensions = dimensions;
		this.carpetPricePerSqFoot = carpetPricePerSqFoot;
	}

	/**
	 * Calculates total cost by calling the method calculateArea from
	 * roomDimension Class and multiplying it by carpetPricePerSqfoot
	 * 
	 * @return the calculate area as well as calculates
	 * the cost of carpeting by multiplying the resultant area 
	 * with carpet price per square foot.
	 */
	public double calculateTotalCost()
	{
		return dimensions.calculateArea() * carpetPricePerSqFoot;
	}

	@Override 
	public String toString()
	{
		return  " \ndimensions of the room are : " + dimensions
				+ " \ncarpetPricePerSqFoot= " + carpetPricePerSqFoot ;
	}
     
	
	
}
