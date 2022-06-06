package day4;

import java.util.Arrays;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		//2 dimensional array
		
		int[] intArray = {1,2,3,4};
//		System.out.println(intArray[1]);
//		System.out.println(Arrays.toString(intArray));
		
		int[][] numbers = {
				{4,5,6},
				{67,34,45},
				{90,23,12}
				};
		System.out.println(numbers[0][2]);
		System.out.println(numbers[2][1]);
		System.out.println("==========================================");
		
		outer: for(int i = 0; i < numbers.length; i++) {
			inner: for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
