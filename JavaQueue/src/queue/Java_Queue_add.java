package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Java_Queue_add {
public static void main(String[] args) {
	Queue<String> queue = new LinkedList<String>();
	queue.add("apple");
	queue.add("mango");
	queue.add("orange");
	queue.add("jackfruit");
	queue.add("custard apple");
	queue.add("watermelon");
	
	System.out.println("The elements in queue are :" + " " + queue);

    queue.add("sapota");
    
    System.out.println("after Adding a  new element");
    System.out.println("The elements in queue are " + " " + queue);
}
}

//================
//add(element)
//================
//Adds an element to the rear of the queue . if the queue is full , it throws and exception 

