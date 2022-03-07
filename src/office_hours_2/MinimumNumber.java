package office_hours_2;

public class MinimumNumber {
	/*
	Create a class and name it MinimumNumber
	create an int array and assign 2, 3, 4, 90, 23 into that array
	Write a code which finds minimum number from the given array

	Submit your code as usual

	*/
	public static void main(String[] args) {
		int[] array = {2,3,4,90,23};
		int minimumNumber = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < minimumNumber) {
				minimumNumber = array[i];
			}
		}
		
		System.out.println("minimumNumber = " + minimumNumber);
	}

}
