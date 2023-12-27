package Strings;

import java.util.HashMap;
import java.util.Map;

public class StringPointers {
	
	public static void main(String[] args) {
		String name1 = "arun";
		String name2 = name1;
		name1 = "kumar";
		System.out.println(name1);
		System.out.println(name2);
		
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		map1.put(1, "arun");
		map2 = map1;
		map1.put(1, "kumar");
		System.out.println(map1);
		System.out.println(map2);
		
	}

}
