package day6;

public class CustomMethodsReturnsAndNoParameter {
	/*
	 *   Methods:
  		- returns - no parameter
	 */
	
	public static void main(String[] args) {
	
		int result = addNumbers();
		System.out.println(result);
	}
	
	public static int addNumbers() {
		int result;
		int a = 34;
		int b = 3;
		result = a + b;
		return result;
	}
	
}
