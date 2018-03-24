/*
 *Book.java
 *Programmer: Saurabh Bansal
 *ULID : sbansa1
 *Feb 9, 2017
 * 
 *Class: IT 168
 *Lecture Section: 1 & 7
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 2 & 8
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;

/**
 * Book Class which defines title, price and the number of books sold.
 * 
 * @author Saurabh Bansal
 *
 */
public class Book
{

	private final double SALES_TAX = .0775;
	private String title;
	private double price;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getTAX()
	{
		return SALES_TAX;
	}

	public void increasePrice(double priceIncrease)
	{
		 this.price = (this.getPrice()) + (this.getPrice() * priceIncrease);
		
	}

	public double calculateSales(int booksSold)
	{
		double totalSales = ((price * booksSold) * (SALES_TAX))
				+ (price * booksSold);
		return totalSales;
	}

}
