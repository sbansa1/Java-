/*
 *Book.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 12, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14 & 15
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;

/**
 * Class with the characterstics of the book
 * 
 *@author Saurabh Bansal
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

	public double increasePrice(double priceIncrease){
	price = (price) + (price * priceIncrease);
	    return price;
	  }
	public double calculateSales(int booksSold){
		double totalSales = ((price * booksSold) * (SALES_TAX)) + (price * booksSold);
		return totalSales;
	}
	
	
	}

