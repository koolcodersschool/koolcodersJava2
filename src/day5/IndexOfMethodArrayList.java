package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfMethodArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
		System.out.println("letters = " + letters);
		System.out.println("letters.indexOf('C') = " + letters.indexOf('E'));
		if(letters.indexOf('E') == -1) {
			System.out.println("E is NOT inside letters arraylist " + letters);
		}else {
			System.out.println("E is inside letters arraylist " + letters);
		}
	}

}
