package day2;

import java.util.Arrays;

public class DoubleArray {
	
	public static void main(String[] args) {
		int[] numbers = {12,34,56,78,89};
		int[] doubleNumbers = new int[5];
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] * 2);
			doubleNumbers[i] = numbers[i] * 2;
		}
		
		System.out.println(Arrays.toString(doubleNumbers));
		
	}

}
