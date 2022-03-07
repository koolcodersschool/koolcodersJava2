package office_hours_2;

public class PrintArrayElements {
	/*
	Create a class and name it PrintArrayElements
	Create a char array and name charArray. Assign 'A', 'B', 'C', 'D' to charArray.
	Print element's of charArray one by one with for loop.
	Submit the assignment as usual.
	*/
	public static void main(String[] args) {
		char[] charArray = new char[4];
		charArray[0] = 'A';
		charArray[1] = 'B';
		charArray[2] = 'C';
		charArray[3] = 'D';
		
		for(int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
	}

}
