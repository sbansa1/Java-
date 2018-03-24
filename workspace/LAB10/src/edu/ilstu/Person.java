/*
 *Person.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Oct 20, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14 & 15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * Person class with general characteristics of a person.
 * 
 * @author Saurabh Bansal
 *
 */
public class Person
{
	private String firstName;
	private String lastName;
	private int age;

	/**
	 * Constructor with parameters which sets the value of the instance
	 * variable.
	 * 
	 * @param firstName Assigns the first name to the person
	 * @param lastName Assigns the last name to the person
	 * @param age assigns the age to the person
	 */
	public Person(String firstName, String lastName, int age)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * getter for first name
	 * 
	 * @return the first name of the person
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * Sets firstName
	 * 
	 * @param it sets the first name of the person
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * gets the Last Name of a person
	 * 
	 * @return the last name of the person
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * Sets the Last name of a person
	 * 
	 * @param assign the last name to a person
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * Gets the age of a person
	 * 
	 * @return the age of the person
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * Sets the age of a person
	 * 
	 * @param assigns age to the person
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
 
	/**Compares if the two instances of the person class has an equal value or not.

	 * @param it checks the first and last name of two person 
	 * @return true if the object values are equal else it returns false
	 */
	public boolean equals(Person obj)
	{

		if (obj instanceof Person)
		{
			return firstName.equals(((Person) obj).getFirstName())
					&& lastName.equals(((Person) obj).getLastName());
		}
		else
		{
			return false;
		}

	}

	@Override
	public String toString()
	{
		return firstName + " " + lastName + " , " + age + " years old ";
	}

}
