package day2;

import java.util.Scanner;

public class AdvancedPolindrome {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the word and we will tell you it is polindrome or not");
		String word = keyboard.next();
		String reversed = "";
		
		for(int i = word.length() -1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		if(word.equalsIgnoreCase(reversed)) {
			System.out.println(word + " is polindrome");
		}else {
			System.out.println(word + " is NOT polindrome");
		}
		
		
		
		
	}

}
