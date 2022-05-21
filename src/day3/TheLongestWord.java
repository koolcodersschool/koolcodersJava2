package day3;

public class TheLongestWord {
	
	public static void main(String[] args) {
		String[] words = {"Messi", "Ronaldo", "Neymar", "Lewandowski"};
		
		int maxLength = 0;
		int index = -1;
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() > maxLength) {
				maxLength = words[i].length();
				index = i;
			}
		}
		
		System.out.println("The longest word is: " + words[index]);
		
	}

}
