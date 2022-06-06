package day4;

import java.util.ArrayList;

public class IntroToArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println(numbers);
		//add numbers into array list
		numbers.add(12);
		System.out.println(numbers);
		numbers.add(76);
		System.out.println(numbers);
		numbers.add(900000);
		System.out.println(numbers);
		
		//size in array list
		int size = numbers.size();
		System.out.println("size = " + size);
		
		// how to read numbers from numbers array list
		System.out.println(numbers.get(1));
		
		//how to remove numbers from numbers array list
		numbers.remove(2);
		System.out.println(numbers);
		
		//numbers.remove(76); //int -> primitive
		numbers.remove(Integer.valueOf(76)); //Integer -> object
		System.out.println(numbers);
		
	}

}
