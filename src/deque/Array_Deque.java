package deque;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class Array_Deque {

	public static void main(String[] args) {
		ArrayDeque arrayDeque = new ArrayDeque<>();

		// adding element at first position
		arrayDeque.addFirst("first");
		System.out.println(arrayDeque);

		//add value
		arrayDeque.add("middle");
		System.out.println(arrayDeque);
		

		// adding element at last position
		arrayDeque.addLast("last");
		System.out.println(arrayDeque);
		
		
		//retrives first
		System.out.println(arrayDeque.peekFirst());
		
		
		//retrives last
		System.out.println(arrayDeque.peekLast());
		
		//retrives value
		System.out.println(arrayDeque.peek());
		
		//Retrieves and removes the first element of this deque
		System.out.println(arrayDeque.poll() +"this");
		System.out.println(arrayDeque);

		

	}
}
