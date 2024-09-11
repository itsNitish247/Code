package queue.priorityQueue;

import java.util.PriorityQueue;

public class Java_PriorityQueue_remove {
public static void main(String[] args) {
	
	PriorityQueue<String> pQueue =  new PriorityQueue<String>();
	
	pQueue.add("Apple");
	pQueue.add("Bannana");
	pQueue.add("Orange");
	pQueue.add("PineApple");
	pQueue.add("MuskMelon");
	
	System.out.println("The elements added to the queue : " + " " + pQueue);
	
	pQueue.remove("Apple");
	pQueue.remove("1");
	
	
	System.out.println("The elements after removing an element : " + " " + pQueue);

	
	
	
}
}
