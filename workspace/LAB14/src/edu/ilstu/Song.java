/*
 *Song.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Nov 15, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14-15
 *Lab Instructor:Saurabh Bansal
 */
package edu.ilstu;

/**
 * Song Class with two attributes to title and artist with a constructor and
 * getters and setters
 * 
 * @author Saurabh Bansal
 *
 */
public class Song
{
	private String title;
	private String artist;

	/**
	 * @param title
	 *            - Intializes the default value to null
	 * @param artist
	 *            - Initializes the default to null;
	 */
	public Song(String title, String artist)
	{
		super();
		this.title = title;
		this.artist = artist;
	}

	/**
	 * @return title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title-sets
	 *            the title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return Artist
	 */
	public String getArtist()
	{
		return artist;
	}

	/**
	 * @param artist
	 *            - sets the artist
	 */
	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	@Override
	public String toString()
	{
		return "Title :" + title + "\n" + "artist : "+ artist + "\n";
	}

}
