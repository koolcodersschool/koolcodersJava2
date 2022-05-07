package day1;

public class Neighbors {
	
	public static void main(String[] args) {
		
		String str = "jaava loopps";
		
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				System.out.println("Beeep ----->>> " + str.charAt(i));
			}
		}
		
		
	}

}
