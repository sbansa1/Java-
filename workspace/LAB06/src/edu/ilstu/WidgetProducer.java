/*
 *WidgetProducer.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 20, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14 & 15
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;

/**
 * Class WidgetProducer to calculate Number of Days with Constructor with one Parameter.
 * 
 * @author Saurabh Bansal
 *
 */
public class WidgetProducer
{
	private final int PRODUCTION_HOURS_PER_DAY = 16;
	private int widgetsPerHours;

	

	/**
	 * @param widgetsPerHours
	 */
	public WidgetProducer(int widgetsPerHours)
	{
		super();
		this.widgetsPerHours = widgetsPerHours;
	}

	/**
	 * @return widgetsPerHours
	 */
	public int getWidgetsPerHours()
	{
		return widgetsPerHours;
	}

	/**
	 * @param totalWidgets
	 * @return numberOfdays
	 */
	public double days(int totalWidgets)
	{
		double numberOfDays = (totalWidgets / widgetsPerHours)
				/ (PRODUCTION_HOURS_PER_DAY);
		return numberOfDays;

	}

}
