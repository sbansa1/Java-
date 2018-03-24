/*
 *Truck.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 20, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:
 *Lab Instructor:
 */
package edu.ilstu;

/**
 * Truck Class with Constructors, Getter and Setter Methods.
 * 
 * @author Saurabh Bansal
 *
 */
public class Truck
{

	int cylinders;
	String manufacturer;
	double load;
	double tow;

	public Truck()
	{

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
		super();
		this.cylinders = cylinders;
		this.manufacturer = manufacturer;
	}

	/**
	 * @param cylinders
	 * @param manufacturer
	 * @param load
	 */
	public Truck(int cylinders, String manufacturer, double load)
	{
		super();
		this.cylinders = cylinders;
		this.manufacturer = manufacturer;
		this.load = load;
	}

	/**
	 * @param cylinders
	 * @param manufacturer
	 * @param load
	 * @param tow
	 */
	public Truck(int cylinders, String manufacturer, double load, double tow)
	{
		super();
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "\n\ncylinders =" + cylinders + "\nmanufacturer = "
				+ manufacturer + "\nload = " + load + "\ntow = " + tow;

	}

}
