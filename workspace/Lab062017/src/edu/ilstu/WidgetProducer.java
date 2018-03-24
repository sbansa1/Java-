/*
 *WidgetProducer.java
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
 * This class defines the methods, constructors to compute how many days would
 * it take to produce X number of widgets.
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
		double numberOfDays = ((double) (totalWidgets / widgetsPerHours))
				/ (PRODUCTION_HOURS_PER_DAY);
		return numberOfDays;

	}

}
