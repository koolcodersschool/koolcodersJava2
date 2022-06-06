package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsAllMethodArrayLIst {
	
	public static void main(String[] args) {
		ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(12,34,45));
		ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(12,34));
		System.out.println("listA.containsAll(listB) ==> " + listA.containsAll(listB));
		
		System.out.println("List A before removing: " + listA);
		System.out.println("List B before removing: " + listB);
		
		listA.removeAll(listB);
		
		System.out.println("List A after removing: " + listA);
		System.out.println("List B after removing: " + listB);
		
	}

}
