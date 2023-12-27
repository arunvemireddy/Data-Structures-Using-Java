package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
//	ArrayList has index unlike 
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.remove(1);
		
		System.out.println(myList.get(1));
	}

}
