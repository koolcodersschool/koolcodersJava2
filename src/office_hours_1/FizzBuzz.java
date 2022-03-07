package office_hours_1;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " is FizzBuzz number");
			} else if (i % 3 == 0) {
				System.out.println(i + " is Fizz number");
			}else if(i % 5 == 0) {
				System.out.println(i + " is Buzz nunmber");
			}
		}
		
	}

}
