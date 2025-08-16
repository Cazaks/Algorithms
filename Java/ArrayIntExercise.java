/*
- initialize a final variable and declare the array
- The control iteration statement and the arithmetic operation by multiplying the array by 2 and adding two also.
- The second control iteration statement to print out the result
*/

import java.util.Arrays;

public class ArrayIntExercise{
	public static void main(String[]args){
	
		final int ARRAY_NUMBERS = 10;
		int[] array = new int[ARRAY_NUMBERS];

		for(int count = 0; count < array.length; count++){
			array[count] =  2 + 2 * count;
		}

		System.out.printf("%s%8s%n", "Index", "Value");

		for(int counter = 0; counter < array.length; counter++){
		System.out.printf("%5d%8d%n", counter, array[counter]);
		}
}
}