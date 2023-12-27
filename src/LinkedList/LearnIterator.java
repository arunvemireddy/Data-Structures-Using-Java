package LinkedList;
import java.util.*;

public class LearnIterator {
	
	static void method1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		int[] arr = {1,2,3,4,5,6};
		
		int[] arr1 = new int[10];
		
		Integer  val1 = Integer.valueOf(100);
		System.out.println(val1);
		
		int a = val1.intValue();
		System.out.println(a);
		
		String s1 = "arun";
		s1 = s1+"kumar";
		System.out.println(s1);
		
		long maxValue = 2147483648L;
		System.out.println("Maximum int value: " + maxValue);
		
		float f1 = 2147483649.85f;
		System.out.println("float"+f1);
		
		System.out.println();
	
		System.gc();
		
		
	
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
	}

	public static void main(String[] args) {
		System.out.println("Learn iterator....!");
		method1();
	
	}
}
