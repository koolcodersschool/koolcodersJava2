package day3;

import java.util.Arrays;

public class SplitMethod {
	
	public static void main(String[] args) {
		
		//split() - returns array based on the sign (regex) which we provide inside it
		
		String str = "We are koolcoders";
		System.out.println("str = " + str);
		
		String[] words = str.split(" ");
		
		for(String each : words) {
			System.out.println(each);
		}
		
		System.out.println(Arrays.toString(words));
	}

}
