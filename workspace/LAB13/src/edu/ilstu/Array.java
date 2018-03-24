package edu.ilstu;

import java.util.Scanner;

public class Array
{

	public static void main(String[]args){
		
		Scanner kb = new Scanner(System.in);
		int [] number = new int [10];
		for(int i = 0; i<number.length;i++){
			
			System.out.println("Enter whole number for index at " + (i));
			number[i] = kb.nextInt();
		}
		for(int i = 0 ; i < number.length; i++){
			System.out.println(number[i]);
		}
	for(int i = number.length - 1 ; i>=0 ; i--){
		System.out.println(number[i]);
		
	}
	}
	
	
}
