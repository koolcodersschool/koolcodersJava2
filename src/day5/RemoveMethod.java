package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMethod {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(54);
		numbers.add(42);
		System.out.println(numbers.toString());
		numbers.remove(1);
		System.out.println(numbers.toString());
		numbers.remove(Integer.valueOf(42));
		System.out.println("numbers.remove(Integer.valueOf(42)) ==> " + numbers.toString());
		
	}

}
