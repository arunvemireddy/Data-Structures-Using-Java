package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Integer> myList = new LinkedList<>();
		myList.add(100);
		myList.add(200);
		myList.add(300);
		
		myList.remove(1);
		System.out.println(myList.get(1));
		
	}

}
