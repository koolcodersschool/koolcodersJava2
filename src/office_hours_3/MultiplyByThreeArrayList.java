package office_hours_3;

import java.util.ArrayList;

public class MultiplyByThreeArrayList {
	/*
	create a class and name it MultiplyByThreeArrayList
	create an array list and name it numbers, and add 3,5,6,7,9,10 inside that array list
	create another array list and name it numbersBy3. All the numbers inside numbers array list multiply by 3 and add them into numbersBy3 array list.
	Print numbersBy3  array list.
	Submit homework as usual.

	*/
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(9);
		numbers.add(10);
		
		ArrayList<Integer> numbersBy3 = new ArrayList<>();
		for(int i = 0; i < numbers.size(); i++) {
			numbersBy3.add(numbers.get(i));
		}
		System.out.println(numbersBy3);
	}

}
