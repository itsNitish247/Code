package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Java_Queue_remove {
public static void main(String[] args) {
	Queue<String> queue=new LinkedList<>();
	
	queue.add("apple");
	queue.add("mango");
	queue.add("orange");
	queue.add("jackfruit");
	queue.add("custard apple");
	queue.add("watermelon");
	
	System.out.println("The elements before removing are :" + " " + queue);
	
	String removeFront = queue.remove();
	System.out.println("The element removed :" + " " + removeFront);
	
	System.out.println("The elements after removing are " + " " +queue);
}
}
//=============
//remove(element)
//=============
//Removes and returns the element at the front of the queue . if the queue is empty , it throws an exception


