package queue.priorityQueue;

import java.util.PriorityQueue;

public class Java_PriorityQueue_add {
	public static void main(String[] args) {

		PriorityQueue<String> pQueue=new PriorityQueue<String>();

		pQueue.add("Apple");
		pQueue.add("Bannana");
		pQueue.add("Orange");
		pQueue.add("PineApple");
		pQueue.add("MuskMelon");

		System.out.println("The elements in the queue are : "+ pQueue);

		pQueue.offer("Cucumber");
		pQueue.offer("Beetroot");
		pQueue.offer("Apple");
		pQueue.offer("1");
		pQueue.offer("2");
		pQueue.offer("0");
		pQueue.offer("-1");
		pQueue.offer("#");
		pQueue.offer(" ");
		
		System.out.println("Thme elememts after offer : " + pQueue);

	}
}
