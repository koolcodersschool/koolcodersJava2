package day4;

import java.util.Arrays;

public class MaxNumber {
	
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 7;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 1;
		System.out.println(Arrays.toString(numbers));
		int maxNumber = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
		}
		
		System.out.println("maxNumber = " + maxNumber);
		
	}

}
