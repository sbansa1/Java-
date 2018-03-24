package edu.ilstu;

public class ArrayNumber
{
public static void main(String[] args){
	int i = 0;
	boolean valid = false;
	int position = -1;
	int [] numberList = {8,10,7,9,11,5};
	
	while(!valid && i < numberList.length){
		if(numberList[i] == 7){
			valid = true;
			position = i;
		}
		i++;
	}
}
}
