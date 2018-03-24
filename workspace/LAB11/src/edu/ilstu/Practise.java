package edu.ilstu;

import java.util.Random;

public class Practise
{

public static void main(String[]args){
	
	Random rn = new Random();
	int num = 0;
	num = rn.nextInt(2) + 1;
	System.out.println(num);
}

}
