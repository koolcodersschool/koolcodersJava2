package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortReverse {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-12, 0, 56, 12, 23, -6));
		System.out.println("numbers before sorting = " + numbers);
		//sort the array list
		Collections.sort(numbers);
		System.out.println("numbers after sorting = " + numbers);
		
		System.out.println("numbers before reversing = " + numbers);
		Collections.reverse(numbers);
		
		System.out.println("numbers after reversing = " + numbers);
		
	}

}
