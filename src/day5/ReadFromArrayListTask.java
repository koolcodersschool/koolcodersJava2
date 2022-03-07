package day5;

import java.util.ArrayList;

public class ReadFromArrayListTask {
	
	public static void main(String[] args) {
		/*
		 * create an arrayList name it vegetables and add 3 vegetables inside it
		 * then read or print each and every vegetable
		 */
		
		ArrayList<String> vegetables = new ArrayList<>();
		vegetables.add("carrot");
		vegetables.add("potato");
		vegetables.add("onion");
		
		for(int i = 0; i < vegetables.size(); i++) {
			System.out.println(vegetables.get(i));
		}
		
	}

}
