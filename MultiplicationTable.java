package day1;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = keyboard.nextInt();
		
		if(number < 1 || number > 10) {
			System.out.println("ERROR: Invalid number!!!");
			System.exit(0);
		}
		
		System.out.println("Mutliplication table for: " + number);
		/*
		 * 3 x 1 = 3
		 * 3 x 2 = 6
		 * 3 x 3 = 9
		 * 3 x 4 = 12
		 * 3 x 5 = 15
		 * 3 x 6 = 18
		 * 3 x 7 = 21
		 * 3 x 8 = 24
		 * 3 x 9 = 27
		 * 3 x 10 = 30
		 */
		
		for(int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(number + " X " + i + " = " + result);
		}
		
		
		
	}

}
