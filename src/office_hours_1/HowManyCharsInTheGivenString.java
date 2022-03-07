package office_hours_1;

public class HowManyCharsInTheGivenString {
	
	public static void main(String[] args) {
		
		String str = "o";
		String sentence = "We are kool coders";
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == str.charAt(0)) {
				count++;
			}
		}
		
		System.out.println("count = " + count);
		System.out.println("There are " + count + " [" + str + "] " + "in the <" +sentence +">");
		
		
		
	}

}
