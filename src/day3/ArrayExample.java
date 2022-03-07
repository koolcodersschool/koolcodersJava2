package day3;

import java.util.Arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		int[] numberArray = new int[3];
		//System.out.println("numberArray " + Arrays.toString(numberArray));
		numberArray[0] = 67;
		
		System.out.println("numberArray " + Arrays.toString(numberArray));
		numberArray[2] = 100;
		
		System.out.println("numberArray " + Arrays.toString(numberArray));
		numberArray[1] = 1;
		
		System.out.println("numberArray " + Arrays.toString(numberArray));
		
	}

}
