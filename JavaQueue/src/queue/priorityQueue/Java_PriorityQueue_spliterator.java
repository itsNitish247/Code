package queue.priorityQueue;

import java.util.PriorityQueue;
import java.util.Spliterator;

public class Java_PriorityQueue_spliterator {
	public static void main(String[] args) {
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue.add("Apple");
		pQueue.add("Bannana");
		pQueue.add("Orange");
		pQueue.add("PineApple");
		pQueue.add("MuskMelon");
		Spliterator<String> split = pQueue.spliterator();
		split.forEachRemaining((n) -> print(n));

	}
	private static void print(String s) {
		System.out.println(s);
		
	}
}
