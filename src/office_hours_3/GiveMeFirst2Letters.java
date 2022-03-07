package office_hours_3;

import java.util.ArrayList;

public class GiveMeFirst2Letters {
	/*
	create a class and name it GiveMeFirst2Letters
	create an array list and name it cars, and add bmw, mercedes, toyota, honda
	create another array list and name it carsFirst2Letters. Extract first 2 letters of each item inside cars array list make them uppercase and add them into carsFirst2Letters array list.
	Print carsFirst2Letters array list.
	Submit homework as usual.
	*/
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("bmw");
		cars.add("mercedes");
		cars.add("toyota");
		cars.add("honda");
		ArrayList<String> carsFirst2Letters = new ArrayList<>();
		for(int i = 0; i < cars.size(); i++) {
			carsFirst2Letters.add(cars.get(i).substring(0,2).toUpperCase());
		}
		System.out.println(carsFirst2Letters);
	}

}
