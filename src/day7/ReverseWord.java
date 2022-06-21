package day7;

public class ReverseWord {
	
	public static void main(String[] args) {
		reverseWord("Vamig");
	}
	
	//write a method which reverses the given word
	//Vamig -> gimaV
	
	public static void reverseWord(String word) {
		for(int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}

}
