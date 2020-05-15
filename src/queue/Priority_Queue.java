package queue;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {

		Priority_Queue.priorityqueueOperation();

	}

	public static void priorityqueueOperation() {

		PriorityQueue priorityQueue = new PriorityQueue();

		priorityQueue.add("this");
		priorityQueue.add("that");

		System.out.println(priorityQueue);

	}

}
