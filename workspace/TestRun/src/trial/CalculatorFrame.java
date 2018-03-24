/*
 *CalculatorFrame.java
 *Programmer: 
 *ULID : 
 *Sep 27, 2016
 * 
 *Class: IT 168
 *Lecture Section: 
 *Lecture Instructor: 
 *Lab Section:
 *Lab Instructor:
 */


package trial;

import java.util.Scanner;

/**
 * Program to calculate the theoretical and real throughput
 * 
 * @author 
 *
 */
public class CalculatorFrame
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		final double PREAMBLE = 8.0;
		final double IFG = 12;
		Scanner keyboard = new Scanner(System.in);
		double frame_size = 0;
		double max_speed = 1000;
		double frame_perSecond = 0;
		double theoritical_Throughput = 0;
		double orignalframeSize = 0;

		// enter the frame size from 64bytes to n bytes and the value will be
		// changed after the computation
		System.out.println("Enter Frame Size from 64 bytes to N bytes");
		frame_size = keyboard.nextDouble();
		double preamble_bits = 0;
		double bits_IFG = 0;
		double ethernet_Bits = 0;
		double real_Throughput = 0;

		orignalframeSize = frame_size;

		frame_size = (frame_size + PREAMBLE + IFG);
		System.out.println("Frame Size after Computation = " + frame_size);
		frame_size = (frame_size) * (8.0);
		frame_perSecond = max_speed / frame_size;

		System.out.println("Orignal Frame Size = " + orignalframeSize);
		System.out.println("Frame Per Second " + frame_perSecond);
		// Theoritical Throughput.
		theoritical_Throughput = (frame_perSecond) * (orignalframeSize * 8.0);
		System.out
				.println("..................................................");

		System.out
				.println("Theoritical Throughput = " + theoritical_Throughput);

		System.out
				.println("..................................................");

		preamble_bits = (PREAMBLE * 8.0);
		System.out.println("Preamble = " + preamble_bits);
		double overhead_Pre = (frame_perSecond) * preamble_bits;
		System.out.println("Overhead Preable = " + overhead_Pre);
		bits_IFG = (IFG * 8.0);
		double overhead_IFG = (frame_perSecond) * bits_IFG;
		System.out.println("Overhead IFG = " + overhead_IFG);

		ethernet_Bits = (18.0 * 8.0);
		double overhead_Ethernet = (frame_perSecond) * ethernet_Bits;
		System.out.println("Overhead Ethernet = " + overhead_Ethernet);
		// Calculates the real throughput
		real_Throughput = (theoritical_Throughput)
				- (overhead_Pre + overhead_IFG + overhead_Ethernet);
		System.out
				.println("..................................................");
		System.out.println("Real Throughput = " + real_Throughput);
		System.out
				.println("..................................................");

		keyboard.close();

	}

}
