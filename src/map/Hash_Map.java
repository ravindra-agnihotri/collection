package map;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {

		Hash_Map.hashmapOperations();
	}

	public static void hashmapOperations() {

		// creating a hashmap with integer key and string value
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		//add values on indexes
		hashMap.put(0, "zero");
		hashMap.put(1, "one");
		System.out.println(hashMap + " --added 2 values");
		
		
		//allows duplicate values
		hashMap.put(3, "one");
		System.out.println(hashMap + " duplicate value added");
		
		
		//adds if index value is absent
		hashMap.putIfAbsent(2, "two");
		System.out.println(hashMap + " --index 2 value added because was absent");
		
		
		hashMap.putAll();
		
		
		

	}

}