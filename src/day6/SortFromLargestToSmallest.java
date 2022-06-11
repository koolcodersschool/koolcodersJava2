package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortFromLargestToSmallest {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12,34,56,67,98,0,1,-3));
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("numbers = " + numbers);
		
		for(Integer each : numbers) {
			System.out.println(each * 3);
		}
		
		System.out.println("===================================================");
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
	}

}
