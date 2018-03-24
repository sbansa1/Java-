/*
 *Circle.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 12, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14 & 15s
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * Circle Class which calculates area,diameter and Circumference of a circle
 * 
 * @author Saurabh Bansal
 *
 */

public class Circle
{
	private final double PI = 3.14;
	private double radius;
	

	// Method which calculates Area
	public double calculateArea()
	{
		double area = PI * (radius * radius);
		return area;

	}

	// Method for calculating Diameter
	public double calculateDiameter()
	{
		double diameter = (radius) * (2.0);
		return diameter;
	}

	// Method for calculating Circumference
	public double calculateCircumference()
	{
		double circumference = (2.0 * PI) * (radius);
		return circumference;
	}

	// Getter for Radius
	public double getRadius()
	{
		return radius;
	}

	// Setter for Radius
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

}
