package day2;

public class Fruits {
	
	public static void main(String[] args) {
		
		String[] fruits = {"apple", "orange", "banana"};
		double[] prices = {10.99, 12.99, 9.78};
		double[] pounds = {2.5, 3.5, 6.4};
		
		//apple -> 10.99 -> 2.5 ==> 27.48
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i] + " -> " + prices[i] + " -> " + pounds[i] + " ==> " + (prices[i] * pounds[i]));
		}
		
		
	}

}
