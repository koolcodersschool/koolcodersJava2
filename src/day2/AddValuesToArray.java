package day2;

import java.util.Arrays;

public class AddValuesToArray {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		System.out.println(Arrays.toString(numbers));
		numbers[0] = 12;
		System.out.println(Arrays.toString(numbers));
		numbers[1] = 34;
		System.out.println(Arrays.toString(numbers));
		numbers[4] = 90;
		System.out.println(Arrays.toString(numbers));
		numbers[2] = 45;
		numbers[3] = 98;
		System.out.println(Arrays.toString(numbers));
		
		for(int eachNumber : numbers) {
			System.out.println(eachNumber);
		}
		
	}

}
