package set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {

		Hash_Set.hashsetOperations();

	}

	public static void hashsetOperations() {

		HashSet hashset = new HashSet();

		// adding value to hashset
		hashset.add(9);
		hashset.add(10);
		
		hashset.add(9);
		System.out.println(hashset);
	}
}
