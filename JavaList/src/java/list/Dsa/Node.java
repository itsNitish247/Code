package java.list.Dsa;

public class Node {
	
	int data;
	Node next;
	
	Node(int value){
		this.data=value;
		this.next=null;
		
	}
}
class Main {
	static int length(Node head) {
		Node temp= head;
		int count = 0;
		while(temp != null) {
			count ++;
			temp=temp.next;
		}
		return count;
		}
	
static void printList(Node head) {
	Node ptr = head;
	while(ptr != null) {
		System.out.println(ptr.data+ " ");
		ptr=ptr.next;									
	}
}
	static Node deleteNodeFromEnd(Node head , int n) {
		int Length=length(head);
		return head;
		}
}
