package day5;

import java.util.ArrayList;

public class RemoveElementFromArraylistTask {
	
	public static void main(String[] args) {
		/*
		 * create an arrayList and name it names, and add 3 names inside it
		 * then remove the last name from that arraylist
		 * and then print them one by one
		 */
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Madina");
		names.add("Fatima");
		names.add("Nadir");
		
		names.remove(2);
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	}

}
