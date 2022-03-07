package day2;

public class Polindrome {
	
	public static void main(String[] args) {
		String str = "toy";
		
		String checkIfPolindrome = "";
		
		checkIfPolindrome = "" + str.charAt(2) + str.charAt(1) + str.charAt(0);
		
		System.out.println("checkIfPolindrome = " + checkIfPolindrome);
		
		if(str.equalsIgnoreCase(checkIfPolindrome)) {
			System.out.println(str + " is polindrome");
		}else {
			System.out.println(str + " is NOT polindrome");
		}
		
	}

}
