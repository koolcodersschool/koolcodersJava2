package day5;

import java.util.ArrayList;

public class ReadFromArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(40);
		nums.add(7);
		nums.add(3);
		
		for(int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
	}

}
