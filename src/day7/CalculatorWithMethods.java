package day7;

import java.util.Scanner;

public class CalculatorWithMethods {
	
	public static void main(String[] args) {
		calculator();
		
	}
	
	public static void calculator() {
		System.out.println("Welcome to my program");
		System.out.println("Enter first number");
		Scanner keyboard = new Scanner(System.in);
		int num1 = keyboard.nextInt();
		
		System.out.println("Enter second number");
		int num2 = keyboard.nextInt();
		
		System.out.println("Enter operator:");
		String operator = keyboard.next();
		
		int result = 0;
		switch(operator) {
			case "+":
				result = addNumbers(num1, num2);
				break;
			case "-":
				result = subtractNumbers(num1, num2);
				break;
			case "/":
				result = divideNumbers(num1, num2);
				break;
			case "*":
				result = multiplyNumbers(num1, num2);
				break;
			default:
				errorMessage();
		}
		
		System.out.println("Answer is = " + result);
	}
	
	/**
	 * This method accepts 2 int parameters and adds them and returns int
	 * @param num1
	 * @param num2
	 * @return int
	 */
	public static int addNumbers(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	/**
	 * This method accepts 2 int parameters and subtract them and returns int
	 * @param num1
	 * @param num2
	 * @return int
	 */
	public static int subtractNumbers(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	/**
	 * This method accepts 2 parameters and multiplies them and returns int
	 * @param num1
	 * @param num2
	 * @return int
	 */
	public static int multiplyNumbers(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	/**
	 * This method accepts 2 int parameters and divides them and returns int
	 * @param num1
	 * @param num2
	 * @return int result
	 */
	public static int divideNumbers(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	
	/**
	 * This method prints error message
	 */
	public static void errorMessage() {
		System.out.println("There is NOT such an operator. Please use + or - or / or *");
	}
	
	

}
