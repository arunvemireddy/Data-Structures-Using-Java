package Arrays;

import java.util.List;

public class ArrayList {
	
	public static void main(String[] args) {
		List<Integer> myList = new java.util.ArrayList<>();
		myList.add(0);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		
		myList.remove(0);
		for(int i:myList) {
			System.out.println(i);
		}
	}

}
