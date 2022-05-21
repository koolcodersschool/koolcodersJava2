package day3;

import java.util.Arrays;

public class BubbleSortReverse {
	
	public static void main(String[] args) {
		
		String[] cities = {"Fairfax", "Orange", "Chantilly", "Arlington"};
		System.out.println("cities = " + Arrays.toString(cities));
		
		for(int i = 0; i < cities.length / 2; i++) {
			String temp = cities[i];
			cities[i] = cities[cities.length - 1 - i];
			cities[cities.length - 1 - i] = temp;
		}
		
		System.out.println("cities after bubble sort = " + Arrays.toString(cities));
		
		
	}

}
