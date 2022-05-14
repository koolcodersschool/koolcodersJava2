package day2;

import java.util.Arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		String name1 = "Nuray";
		String name2 = "Omar";
		String name3 = "Asad";
		String name4 = "Senan";
		String name5 = "Murad";
		
		String[] names = {"Nuray", "Omar", "Asad", "Senan", "Murad"};
		System.out.println(Arrays.toString(names));
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//System.out.println(name1 + " " + name2 + " " + name3 + " " + name4 + " " + name5 + " are koolcoders");
		
		
	}

}
