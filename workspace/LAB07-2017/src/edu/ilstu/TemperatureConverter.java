/*
 *TemperatureConverter.java
 *Programmer: Saurabh Bansal
 *ULID : sbansa1
 *Feb 25, 2017
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:2 & 8
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * Class with different type of conversions
 * 
 * @author Saurabh Bansal
 *
 */

public class TemperatureConverter
{

	/**
	 * @param The
	 *            method coverts the temperature in celcius to fahrenheit
	 * @return the temperature in fahrenheit.
	 */
	public static double celsiusToFahrenheit(double celcius)
	{
		double farenheit = (celcius) * (9.0 / 5.0) + 32;
		return farenheit;

	}

	/**
	 * @param The
	 *            method coverts the temperature in celcius to kelvin
	 * @return The temperature in Kelvin.
	 */
	public static double celciusToKelvin(double celcius)
	{
		double kelvin = (celcius) + 273.15;
		return kelvin;
	}

	/**
	 * @param The
	 *            method coverts the temperature from fahrenheit to celcius
	 * @return the temperature in Celcius
	 */
	public static double fahrenheitToCelcius(double fahrenheit)
	{
		double celcius = (fahrenheit - 32) * (5.0 / 9.0);
		return celcius;
	}

	/**
	 * @param The
	 *            method coverts the temperature from fahrenheit to Kelvin
	 * @return the temperature in Kelvin.
	 */
	public static double fahrenheitToKelvin(double fahrenheit)
	{
		double kelvin = (fahrenheit - 32) * (5.0 / 9.0) + 273.15;
		return kelvin;
	}

	/**
	 * @param The
	 *            method coverts the temperature from Kelvin to celcius
	 * @return The temperature in Celcius.
	 */
	public static double kelvinToCelcius(double kelvin)
	{
		double celcius = (kelvin - 273.15);
		return celcius;
	}

	/**
	 * @param The
	 *            method coverts the temperature from kevlin to Fahrenheit.
	 * @return the temperature in Fahrenheit.
	 */
	public static double kelvinToFahrenheit(double kelvin)
	{
		double fahrenheit = (kelvin - 273.15) * (9.0 / 5.0) + 32;
		return fahrenheit;
	}
}
