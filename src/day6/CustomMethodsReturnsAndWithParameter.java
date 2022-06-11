package day6;

public class CustomMethodsReturnsAndWithParameter {
	/*
	 *   Methods:
  		- returns - with parameter
	 */
	
	public static void main(String[] args) {
		int result = multiplyNumbers(7, 9);
		System.out.println(result);
	}
	
	public static int multiplyNumbers(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	
}
