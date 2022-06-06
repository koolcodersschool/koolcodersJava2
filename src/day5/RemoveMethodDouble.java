package day5;

import java.util.ArrayList;

public class RemoveMethodDouble {
	
	public static void main(String[] args) {
		//double -> primitive
		//Double -> Wrapper class (Object)
		
		ArrayList<Double> doubleNumbers = new ArrayList<>();
		doubleNumbers.add(12.3);
		doubleNumbers.add(34.5);
		doubleNumbers.add(67.8);
		System.out.println(doubleNumbers);
		doubleNumbers.remove(67.8);
		System.out.println(doubleNumbers);
	}

}
