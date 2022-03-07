package office_hours_2;

import java.util.Arrays;

public class CombineArrays {
	/*


	Create a class and name it CombineArrays
	create String array and name it fruits, and assign "bananas", "apples", "oranges" to it.
	create String array and name it vegetables, and assign "cucumber", "tomato", "potato" to it.
	create String array and name it basket, and combine fruits and vegetables arrays and assign to basket array.
	Submit the assignment as usual.

	*/
	public static void main(String[] args) {
		String[] fruits = {"bananas", "apples", "oranges"};
		String[] vegetables = {"cucumber", "tomato", "potato"};
		String[] basket = new String[6];
		//lets put fruits into the basket first
		for(int i = 0; i < fruits.length; i++) {
			basket[i] = fruits[i];
		}
		//now lets put vegetables into the basket
		for(int i = 0; i < vegetables.length; i++) {
			basket[i+3] = vegetables[i];
		}
		//Please explain why we wrote basket[i+3] because 0,1,2 indexes are fruits in basket. Thats why we need to fill 3,4,5 indexes with vegetables. 
		//lets print basket and see what we have in it
		System.out.println(Arrays.toString(basket));
	}

}
