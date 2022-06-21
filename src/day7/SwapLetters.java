package day7;

public class SwapLetters {
	
	public static void main(String[] args) {
		String str = "Yusif";
		swapLetters(str);
	}
	
	//write a method which swaps first and last letter of the word
	//Asad -> dsaA
	public static void swapLetters(String word) {
		String result = "" + word.charAt(word.length()-1) + word.substring(1, word.length()-1) + word.charAt(0);
		System.out.println(result);
	}

}
