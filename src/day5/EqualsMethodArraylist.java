package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class EqualsMethodArraylist {

	public static void main(String[] args) {
		ArrayList<String> fruits1 = new ArrayList<>(Arrays.asList("banana", "apple", "orange"));
		ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("banana", "apple", "orange"));
		System.out.println("fruits1 = " + fruits1);
		System.out.println("fruits2 = " + fruits2);
		System.out.println("fruits1.equals(fruits2) ==> " + (fruits1.equals(fruits2)));
	}
	
}
