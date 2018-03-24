/*
 *CDDriver.java
 *Programmer: Saurabh Bansal
 *ULID : 819654128
 *Nov 15, 2016
 * 
 *Class: IT 168
 *Lecture Section: 13
 *Lecture Instructor: Patricia Mastuda
 *Lab Section:14-15
 *Lab Instructor:Saurabh bansal
 */
package edu.ilstu;

/**
 *SongDriver Class for the
 *execution of Song Class
 * 
 *@author Saurabh Bansal
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CDDriver
{

	public static void main(String[] args) throws IOException
	{
		final int MAX_ARRAY_SIZE = 50;
		final String FILENAME = "Collection.txt";
		Scanner input = null;
		int count = 0; // Counter to keep track of number of elements in the
						// array
		int choice = 0; // Menu choice
		FileWriter fw = null;
		PrintWriter out = null;

		try
		{
			input = new Scanner(new File(FILENAME));
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.getStackTrace());
		}

		// Create array to hold song collection
		Song songCollection[] = new Song[MAX_ARRAY_SIZE];

		String title = null;
		String artist = null;
		int i = 0;
		// Song song = new Song(title, artist);
		// Read the data from the input file into the array

		while (input.hasNext() && i < songCollection.length)
		{

			title = input.nextLine();
			artist = input.nextLine();
			songCollection[i] = new Song(title, artist);
			i++;
		}

		// Return the count for the elements currently in the array
		for (i = 0; i < songCollection.length; i++)
		{
			if (songCollection[i] != null)
				count++;
		}
		System.out.println(count);

		// Open the file to append (this is the same file used for the input)
		try
		{
			fw = new FileWriter(FILENAME, true);
			out = new PrintWriter(fw);
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}

		// Print the menu
		System.out.print("Enter 1, 2 or 3 : " );
		// Read the menu choice
		Scanner kb = new Scanner(System.in);
		choice = kb.nextInt();

		while (choice != 3)
		{
			switch (choice)
			{
			case 1:
				// Read a new song to add to the collection from the keyboard
				System.out.print("Enter your favourite song title : ");
				if (kb.nextLine() != null)
				{
					title = kb.nextLine();
				}
				System.out.println("Enter artist Name : ");
				artist = kb.nextLine();

				Song song = new Song(title, artist);
				// Add the song to the array
				songCollection[count] = song;
				// Don't forget to increment the count
				if (songCollection[count] != null)
				{
					count++;
				}
				// System.out.println(songCollection[count-1]);

				System.out.println(count);
				// Writing to the File
				out.write(song.toString());
				out.flush();

				
				System.out.println(songCollection[count - 1]);

				break;
			case (2):

				for (i = 0; i < songCollection.length; i++)
				{
					if (songCollection[i] != null)
						System.out.println(songCollection[i]);

				}
				break;

			default:
				System.out.println("Invalid menu choice.  Please try again.");
				break;
			}
			// Print the menu
			System.out.println("Enter 1, 2 or 3 :");
			// Read the menu choice
			choice = kb.nextInt();

		}
		out.close();
		input.close();
		kb.close();

		// Close the output file

	}

}
