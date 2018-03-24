/*
 *Cone.java
 *Programmer: Saurabh Bansal
 *ULID : Sbansa1
 *Feb 9, 2017
 * 
 *Class: IT 168
 *Lecture Section: 1 & 7
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 8 & 2
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;

/**
 * Class which defines the surface area, volume and slant height of the cone.
 * 
 * @author Saurabh Bansal
 *
 */
public class Cone
{
	private double radius;
	private double height;

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	// Method to calculate Volume
	public double calculateVolume()
	{
		double volume = 1.0 / 3 * (radius * height);
		return volume;

	}

	// Method for calculate Slant Height
	public double calculateSlantHeight()
	{
		double slantHeight = Math.sqrt((radius * radius) + (height * height));
		return slantHeight;
	}

	// Method for calculate Surface Area
	public double calculateBaseSurfaceArea()
	{
		double surfaceArea = (Math.PI) * (radius * radius);
		return surfaceArea;
	}
}
