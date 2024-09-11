package queue.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Java_PriorityQueue_comparator {
	public static void main(String[] args) {

		PriorityQueue<String> pQueue= new PriorityQueue<String>();

		pQueue.add("Apple");	
		pQueue.add("Bannana");
		pQueue.add("Orange");
		pQueue.add("PineApple");
		pQueue.add("MuskMelon");
		
		//creating a comparator
		Comparator<String> compare =  (Comparator<String>) pQueue.comparator();
		
		System.out.println("");
		

	}
}
