package office_hours_3;

import java.util.ArrayList;

public class MakeAllUppercase {
	/*
	create a class and name it MakeAllUppercase
	create an array list and name it fruits, and add orange, apple, banana into that array list
	create another array list and name it fruitsUppercase. Make all the items in fruits array list uppercase, and add them into fruitsUppercase array list.
	Print fruitUppercase array list.
	Submit homework as usual.
	*/
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("banana");
		ArrayList<String> fruitsUppercase = new ArrayList<>();
		for(int i = 0; i < fruits.size(); i++) {
			fruitsUppercase.add(fruits.get(i).toUpperCase());
		}
		
		System.out.println(fruitsUppercase);
	}

}
