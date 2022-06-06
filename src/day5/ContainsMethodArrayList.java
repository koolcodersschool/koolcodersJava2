package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsMethodArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12,45,76,89,90));
		System.out.println(numbers);
		//check if numbers array list contains 89
		System.out.println("numbers.contains(89) ==> " + numbers.contains(89));
		
		//check if numbers array list contains 100
		int number = 76;
		if(numbers.contains(number)) {
			System.out.println(number + " is inside numbers arrayList ==> " + numbers);
		}else {
			System.out.println(number + " is NOT inside numbers arrayList ==> " + numbers);
		}
		
		
	}

}
