package day5;

import java.util.ArrayList;

public class RemoveElementFromArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(9.5);
		numbers.add(10.3);
		numbers.add(3.5);
		
		System.out.println("numbers = " + numbers);
		numbers.remove(10.3);
		System.out.println("numbers = " + numbers);
		numbers.remove(1);
		System.out.println("numbers = " + numbers);
		
	}

}
