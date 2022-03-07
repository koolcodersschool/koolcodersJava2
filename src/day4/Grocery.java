package day4;

import java.util.Arrays;

public class Grocery {
	
	public static void main(String[] args) {
		String[] fruits = new String[4];
		fruits[0] = "bananas";
		fruits[1] = "apples";
		fruits[2] = "kiwi";
		fruits[3] = "orange";
		
		System.out.println("fruits: " + Arrays.toString(fruits));
		double[] pounds = new double[4];
		pounds[0] = 2.5;
		pounds[1] = 3.5;
		pounds[2] = 2;
		pounds[3] = 5;
		
		System.out.println("pounds: " + Arrays.toString(pounds));
		
		double[] prices = new double[4];
		prices[0] = 4.5;
		prices[1] = 5.2;
		prices[2] = 3.6;
		prices[3] = 9.99;
		
		System.out.println("prices: " + Arrays.toString(prices));
		
		System.out.println(fruits[0] + " -> " + pounds[0] + " -> " + prices[0]);
		System.out.println(fruits[1] + " -> " + pounds[1] + " -> " + prices[1]);
		System.out.println(fruits[2] + " -> " + pounds[2] + " -> " + prices[2]);
		System.out.println(fruits[3] + " -> " + pounds[3] + " -> " + prices[3]);
		
		System.out.println("======================================================");
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i] + " -> " + pounds[i] + " -> " + prices[i]);
		}
		
	}

}
