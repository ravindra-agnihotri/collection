package list;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		Array_List.arrayListFunctions();

	}

	public static void arrayListFunctions() {
		//defining arraylist
		ArrayList<Object> al = new ArrayList<>();
		
		//add values in arraylist
		al.add("String");
		al.add(007);
		al.add(1, "elematone");
		al.add(1.007);
		al.add(true);
		
		//replace value at any index which is already present
		al.set(0, "Replace");
		
	
		
		
		System.out.println(al);

	}
}