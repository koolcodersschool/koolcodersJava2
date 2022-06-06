package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class ClearIsEmptySortReverse {
	
	public static void main(String[] args) {
		ArrayList<Double> nums = new ArrayList<>(Arrays.asList(12.4, 45.5, 67.8));
		System.out.println("nums = " + nums);
		System.out.println("nums.isEmpty() before clear = " + nums.isEmpty());
		
		nums.clear();
		System.out.println("nums = " + nums);
		
		System.out.println("nums.isEmpty() after clear = " + nums.isEmpty());
		
		
	}

}
