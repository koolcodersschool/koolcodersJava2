package day8_9;

import java.util.ArrayList;

public class StaticListVariable {
	static ArrayList<Integer> list = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		list.add(1);
		list.add(2);
		displayList();
	}
	
	public static void displayList() {
		System.out.println(list);
	}

}
