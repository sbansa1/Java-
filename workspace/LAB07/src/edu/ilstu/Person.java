/*
 *Person.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Sep 27, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: Patricia Mastuda
 *Lab Section: 14  & 15
 *Lab Instructor: Saurabh Bansal
 */
package edu.ilstu;

/**
 * Person class to determine the gender, title, name and martial Status
 * 
 * @author Saurabh Bansal
 *
 */
public class Person
{
	private String title;
	private String name;
	private String gender;
	private String maritalStatus;

	/**
	 * Constructor with three parameters
	 * 
	 * @param name
	 * @param gender
	 * @param maritalStatus
	 */
	public Person(String name, String gender, String maritalStatus)
	{
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	/**
	 * Method with no return type to determine title.
	 */
	public void determineTitle()
	{
		if (gender == "M" && maritalStatus == "M")

		{
			title = "Mr.";

		}
		else if (maritalStatus == "S" && gender == "M")
		{
			title = "Mr.";
		}

		if (gender == "F" && maritalStatus == "M")
		{
			title = "Mrs.";

		}
		else if (gender == "F" && maritalStatus == "S")
		{
			title = "Miss";
		}

	}

	/**
	 * Method of the type boolean to check if the gender is valid or not.
	 *
	 * @return true if valid and false if not valid
	 */
	public boolean isValidGender()
	{

		boolean checkValidInput = false;
		if (gender == "M" || gender == "F")
		{
			return checkValidInput = true;
		}
		else
		{
			System.out.println("Invalid Input");
			return checkValidInput;
		}

	}

	/**
	 * Method of the type boolean to check if the marital stauts is valid or
	 * not.
	 * 
	 * @return true or false
	 */
	public boolean isValidMaritalStatus()
	{

		boolean validInput = false;
		if (maritalStatus.equals("S") || maritalStatus == "M")
		{
			return validInput = true;
		}
		else
		{
			return validInput;
		}
	}

	/**
	 * Getter Method for title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Setter Method for Title
	 * 
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * Getter Method for Name
	 * 
	 * @return name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Setter method for Name
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Getter Method for Gender
	 * 
	 * @return gender
	 */
	public String getGender()
	{
		return gender;
	}

	/**
	 * Setter Method for gender
	 * 
	 * @param gender
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	/**
	 * Getter Method for Marital Status
	 * 
	 * @return maritalStatus
	 */
	public String getMaritalStatus()
	{
		return maritalStatus;
	}

	/**
	 * Setter Method for Marital Status
	 * 
	 * @param maritalStatus
	 */
	public void setMaritalStatus(String maritalStatus)
	{
		this.maritalStatus = maritalStatus;
	}

}