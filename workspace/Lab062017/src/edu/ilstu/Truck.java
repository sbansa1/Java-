/*
 *Truck.java
 *Programmer: Saurabh Bansal
 *ULID : Sbansa1
 *Feb 17, 2017
 * 
 *Class: IT 168
 *Lecture Section: 1 & 7
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:2 & 8	
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * Class with overloaded constructor with different Parameters.
 * 
 * @author Saurabh Bansal
 *
 */

public class Truck
{

	private int cylinders;
	private String manufacturer;
	private double load;
	private double tow;

	public Truck()
	{
		super();
	}

	/**
	 * @param cylinders
	 */
	public Truck(int cylinders)
	{
		super();
		this.cylinders = cylinders;
	}

	/**
	 * @param cylinders
	 * @param manufacturer
	 */
	public Truck(int cylinders, String manufacturer)
	{
		
		this.cylinders = cylinders;
		this.manufacturer = manufacturer;
	}

	/**
	 * @param cylinders
	 * @param manufacturer
	 * @param load
	 * @param tow
	 */
	public Truck(int cylinders, String manufacturer, double load, double tow)
	{
		
		this.cylinders = cylinders;
		this.manufacturer = manufacturer;
		this.load = load;
		this.tow = tow;
	}

	/**
	 * @return
	 */
	public int getCylinders()
	{
		return cylinders;
	}

	/**
	 * @param cylinders
	 */
	public void setCylinders(int cylinders)
	{
		this.cylinders = cylinders;
	}

	/**
	 * @return manufacturer
	 */
	public String getManufacturer()
	{
		return manufacturer;
	}

	/**
	 * @param manufacturer
	 */
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	/**
	 * @return load
	 */
	public double getLoad()
	{
		return load;
	}

	/**
	 * @param load
	 */
	public void setLoad(double load)
	{
		this.load = load;
	}

	/**
	 * @return tow
	 */
	public double getTow()
	{
		return tow;
	}

	/**
	 * @param tow
	 */
	public void setTow(double tow)
	{
		this.tow = tow;
	}

	/**
	 * Print Method to print the output
	 * 
	 */
	public void print()
	{
		System.out.println("\n\ncylinders =" + cylinders + "\nmanufacturer = "
				+ manufacturer + "\nload = " + load + "\ntow = " + tow);

	}

}
