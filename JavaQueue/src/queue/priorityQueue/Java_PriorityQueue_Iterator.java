package queue.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Java_PriorityQueue_Iterator {
public static void main(String[] args) {
	PriorityQueue<String> pQueue = new PriorityQueue<String>();
	

	pQueue.add("Apple");
	pQueue.add("Bannana");
	pQueue.add(" ");
	pQueue.add("PineApple");
	pQueue.add("MuskMelon");


   Iterator<String> value = pQueue.iterator();
   
   System.out.println("The elements are : ");
	while(value.hasNext()) {
		System.out.println(value.next());
	}


	

}
}
