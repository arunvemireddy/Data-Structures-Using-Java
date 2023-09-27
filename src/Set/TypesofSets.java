package Set;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class TypesofSets {

	void HashSet() {
		System.out.println("\tHashSet");
		Set<String> hashSet = new HashSet<>(Arrays.asList("banana", "cherry", "apple", "banana"));

//		no duplicated does not guarantee on order
		for (String fruit : hashSet) {
			System.out.println(fruit);
		}
	}

	void TreeSet() {
		System.out.println("\tTreeSet");
		Set<String> treeSet = new TreeSet<>(Arrays.asList("apple", "cherry", "banana"));

		// Maintains natural order or custom order
		for (String fruit : treeSet) {
			System.out.println(fruit);
		}
	}

	void LinkedHashSet() {
		System.out.println("\tLinkedHashSet");
		Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("cherry", "apple", "banana"));

		// Maintains Insertion Order
		for (String fruit : linkedHashSet) {
			System.out.println(fruit);
		}
	}

	void ConcurrentSkipListSet() {
		System.out.println("\tConcurrentSkipListSet");
		Set<String> skipListSet = new ConcurrentSkipListSet<>(Arrays.asList("cherry", "banana", "apple"));
		// Adding elements to the ConcurrentSkipListSet (sorted and thread-safe)

		// Iterating through the ConcurrentSkipListSet (sorted order, thread-safe)
		for (String fruit : skipListSet) {
			System.out.println(fruit);
		}
	}

	void CopyOnWriteArraySet() {
		System.out.println("\tCopyOnWriteArraySet");
		Set<String> copyOnWriteSet = new CopyOnWriteArraySet<>(Arrays.asList("apple", "cherry", "banana"));
		// Adding elements to the CopyOnWriteArraySet

		// Iterating through the CopyOnWriteArraySet (thread-safe)
		for (String fruit : copyOnWriteSet) {
			System.out.println(fruit);
		}
	}

	void bitSet() {
		System.out.println("\tBitset");
		BitSet bitSet = new BitSet();
		bitSet.set(0);
		bitSet.set(2);
		bitSet.set(3);

		System.out.println(bitSet.get(2));
		System.out.println(bitSet.get(1));

		bitSet.clear(2);
		System.out.println(bitSet.get(2));
	}

	public static void main(String[] args) {
		TypesofSets typesofSets = new TypesofSets();
		typesofSets.HashSet();
		typesofSets.TreeSet();
		typesofSets.LinkedHashSet();
		typesofSets.ConcurrentSkipListSet();
		typesofSets.CopyOnWriteArraySet();
		typesofSets.bitSet();
	}

}
