package day3;

import java.util.Arrays;

public class MaxNumberFromArray {
	
	public static void main(String[] args) {
		int[] numberArray = new int[5];
		numberArray[0] = 12;
		numberArray[1] = 45;
		numberArray[2] = 1;
		numberArray[3] = 4;
		numberArray[4] = 9;
		
		System.out.println(Arrays.toString(numberArray));
		
		int maxNumber = 0;
		
		for(int i = 0; i < numberArray.length; i++) {
			if(numberArray[i] > maxNumber) {
				maxNumber = numberArray[i];
			}
		}
		System.out.println("maxNumber = " + maxNumber);
		
	}

}
