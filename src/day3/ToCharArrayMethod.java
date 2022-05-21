package day3;

import java.util.Arrays;

public class ToCharArrayMethod {
	
	public static void main(String[] args) {
		
		String name = "Messi";
		
		char[] nameArray = name.toCharArray();
		System.out.println(Arrays.toString(nameArray));
		
		for(char each : nameArray) {
			System.out.println(each);
		}
		
	}

}
