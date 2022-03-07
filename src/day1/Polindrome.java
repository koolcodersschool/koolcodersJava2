package day1;

public class Polindrome {
	
	public static void main(String[] args) {
		
		// write a program which checks if the word is polindrome or not
		//civic - polindrome (if we read a word from left to right and right to left it sounds same then that word is polindrome)
		//mom - polindrome
		//Omar - NOT polindrome
		
		String str = "mom";
		
		String result = "";
		//str.charAt(2) -> last 'm'
		//str.charAt(1) -> 'o'
		//str.charAt(0) -> first 'm'
		//str.length() -> gives number of characters in the String
		for(int i = str.length() - 1; i >= 0; i--) {
			result += "" + str.charAt(i);
		}
		//result = "mom";
		
		System.out.println("str - " + str);
		System.out.println("result - " + result);
		
		if(str.equalsIgnoreCase(result)) {
			System.out.println(str + " is polindrome");
		}else {
			System.out.println(str + " is not polindrome");
		}
		
	}

}
